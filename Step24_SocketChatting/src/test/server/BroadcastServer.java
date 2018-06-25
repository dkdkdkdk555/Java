package test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
/*
 *  [ 문자열 전송 약속 ]
 *  
 *  0#id  				=> 새로운 클라이언트 접속 메세지
 *  1#id#message 		=> 대화 메세지
 *  2#id				=> 대화방 탈퇴 메세지
 *  3#id1,id2,id3 ... 	=> 대화 참여자 목록 메세지
 *  
 */
public class BroadcastServer {
	// ServerThread 객체를 저장할 static 맴버필드
	private static List<ServerThread> threadList=new ArrayList<>();
	
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5000);
			while(true) {
				System.out.println("클라이언트의 접속 대기중...");
				Socket socket=serverSocket.accept();
				//스레드 객체 생성
				ServerThread thread=new ServerThread(socket);
				//스레드를 시작 시킨다.
				thread.start();
				//스레드의 참조값을 List 에 저장 
				threadList.add(thread);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
		}
	}
	
	//스레드 객체를 생성할 클래스 설계
	static class ServerThread extends Thread{
		//필드 
		private Socket socket;
		private BufferedReader br;
		private BufferedWriter bw;
		private String id;//대화명 
		
		//생성자
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달된 Socket 객체를 필드에 저장 
			this.socket=socket;
		}
		
		@Override
		public void run() {
			try {
				//클라이언트가 전송한 문자열을 읽을 객체 
				br=new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
				//클라이언트에게 문자열을 출력할 객체 
				bw=new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
				boolean isRun=true;
				while(isRun) {//반복문 돌면서 
					String msg=null;
					try {
						//클라이언트의 문자 전송을 기다린다. 
						msg=br.readLine();
					}catch(SocketException se) {
						se.printStackTrace();
					}
					if(msg==null) {//접속이 끈긴경우
						//배열에서 해당 스레드 제거
						threadList.remove(this);
						//반복문 탈출 하도록
						isRun=false;
						//수정된 참여자 목록 보내기
						sendClientList();
					}else {//도착한 메세지가 있는 경우 
						//#으로 구분해서 문자열을 배열로 얻어온다.
						String[] result=msg.split("#");
						//메세지의 종류 (0 or 1 or 2)
						int msgType=Integer.parseInt(result[0]);
						switch(msgType) {
						case 0: //새로운 대화 참여자 입장
							//아이디를 필드에 저장
							id=result[1];
							//참여자 목록 보내기 
							sendClientList();
							break;
						case 1: //새로운 대화 메세지 도착
							//메세지 보내기
							sendMessage(msg);
							break;
						case 2: //대화 참여자 탈퇴 
							sendMessage(msg);
							//스레드 목록헤서 삭제
							threadList.remove(this);
							//스레드 종료
							isRun=false;
							//대화 참여자 목록 다시 보내기
							sendClientList();
							break;
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(br!=null)br.close();
					if(bw!=null)bw.close();
					if(socket!=null)socket.close();
				}catch(Exception e) {}
			}
		}//run()
		
		//새로운 참여자가 들어왔을때 처리하는 메소드
		public void sendClientList() throws IOException {
			//이벤트의 종류
			String data="3";
			//반복문 돌면서 
			for(int i=0; i<threadList.size(); i++) {
				//i번째 스레드의 참조값 얻어오기
				ServerThread tmp=threadList.get(i);
				if(i==0) {//처음 반복문을 도는 것이라면
					data=data+"#"+tmp.id;
				}else {
					data=data+","+tmp.id;
				}
			}
			//반복문 돌고 나면 data 는 "3#김구라,해골,원숭이 ..."
			//와 같은 형태의 문자열 이다. 
			//모든 클라이언트에게 data 보내기
			sendMessage(data);
		}
		//모든 클라이언트에게 문자열을 보내는 메소드
		public void sendMessage(String msg) throws IOException {
			for(ServerThread tmp:threadList) {
				tmp.bw.write(msg);
				tmp.bw.newLine();
				tmp.bw.flush();
			}
		}
		
	}//class ServerThread
}















