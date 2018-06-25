package test.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BroadcastClient extends JFrame implements ActionListener{
	//맴버필드
	String ip, id;
	private JTextArea jta; //쳇팅의 내용을 출력할곳
	private JTextField jtf; //전송할 메세지를 작성할곳
	private JLabel jlb1, jlb2;  //레이블
	private JPanel jp1, jp2, jp3; //페널
	private JButton jbtn; //전송 버튼 
	private JList jlist; //접속자 명단을 출력할 곳 
	//문자열을 읽어들이거나 출력할 객체
	private BufferedReader br;
	private BufferedWriter bw;
	//생성자
	public BroadcastClient(String ip, String id){
		this.ip=ip;
		this.id=id;
		//메세지를 입력할 TextField
		jtf=new JTextField(30);
		//전송버튼 
		jbtn=new JButton("전송");
		//페널객체 생성
		jp1=new JPanel();
		//페널 내부에서의 레이아웃 설정
		jp1.setLayout(new BorderLayout());
		jp1.add(jtf, BorderLayout.CENTER);
		jp1.add(jbtn, BorderLayout.EAST);
		
		//프레임의 레이아웃 설정 
		setLayout(new BorderLayout());
		add(jp1, BorderLayout.SOUTH);
		
		//접속 정보 출력하기 
		jlb1=new JLabel("사용자 id:"+id);
		jlb2=new JLabel("ip:"+ip);
		jp2=new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(jlb1, BorderLayout.WEST);
		jp2.add(jlb2, BorderLayout.EAST);
		
		add(jp2, BorderLayout.NORTH);
		
		// row : 10, col : 50  사이즈의 TextArea 객체 생성
		jta = new JTextArea("", 10, 50);
		jta.setBackground(Color.pink); //배경색을 핑크색으로
		//스크롤 가능하도록
		JScrollPane jsp=new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,   //수직 스크롤바 생기도록
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //수평 스크롤바 불가
		add(jsp, BorderLayout.CENTER);
		
		//접속자 명단에 관련된 처리
		String[] names={"접속자 명단"};
		jlist=new JList(names);
		jlist.setBackground(Color.yellow);
		jp3=new JPanel();
		jp3.setLayout(new BorderLayout());
		jp3.add(jlist, BorderLayout.CENTER);
		
		add(jp3, BorderLayout.EAST);
		
		//TextArea 수정 불가 
		jta.setEditable(false);
		
		//프레임의 위치와 크기 지정 
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
		//전송버튼 리스너 연결 
		jbtn.addActionListener(this);
		
		//스레드 시작 시키기
		new ClientThread().start();
		//WindowListener 등록
		addWindowListener(wAdapter);
		//JTextField ActionListener 등록
		//텍스트 필드에 액션 리스너를 등록하면 엔터키를 눌렀을때
		//이벤트가 발생한다. 
		jtf.addActionListener(this);
		
	}//생성자 BroadcastClient() 
	
	//익명의 inner class 를 이용해서 WindowAdapter 객체 만들기
	WindowAdapter wAdapter=new WindowAdapter() {
		//창을 닫기 직전에 호출되는 메소드 
		public void windowClosing(WindowEvent e) {
			//서버에 접속을 해제한다는 메세지 보내기 
			try{
				bw.write("2#"+id);
				bw.newLine();
				bw.flush();
			}catch(Exception ie){
				ie.printStackTrace();
			}
			//프로세스 강제 종료
			System.exit(0);
		}
	};
	
	
	
	public static void main(String[] args) {
		new BroadcastClient("192.168.0.73", "김구라");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열을 읽어온다.
		String msg=jtf.getText();
		if(msg.equals(""))return;
		//서버에 보낼 문자열을 구성한다.
		String str="1#"+id+"#"+msg;
		try {
			//서버에 문자열 출력하기(전송하기)
			bw.write(str);
			bw.newLine();
			bw.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//입력창 초기화 
		jtf.setText("");
	}
	//서버에서 도착하는 메세지를 받을 스레드 
	class ClientThread extends Thread{
		//run() 메소드 오버라이딩
		@Override
		public void run() {
			Socket socket=null;
			try{
				//지정된 ip 로 소켓 접속하기 
				socket=new Socket(ip, 5000);
				//서버가 전송한 문자열을 읽어 들일 객체 
				br=new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
				//서버에게 문자열을 출력할 객체 
				bw=new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
				
				//쳇팅방 입장에 관련된 메세지를 서버에 보낸다.
				bw.write("0#"+id);
				bw.newLine();
				bw.flush();
				
				boolean isRun=true;
				while(isRun){
					//서버가 보내는 문자열이 있으면 읽어온다. 
					String msg=br.readLine();
					
					String[] result=null;
					try{
						result=msg.split("#");
					}catch(NullPointerException ne){
						ne.printStackTrace();
						continue;
					}
					
					String msgType=result[0];		
					if(msgType.equals("0")){
						//입장한 사람의 아이디 읽어오기
						String userId=result[1];
						//새로운 참여자가 입장했다고 출력한다.
						jta.append(userId+" 님 입장 \r\n");
						
					}else if(msgType.equals("1")){
						//보낸사람
						String userId=result[1];
						//메세지 내용
						String str=result[2];
						//JTextArea 에 누적 출력 시키기 
						jta.append(userId+" : "+str+"\r\n");
					}else if(msgType.equals("2")){ //퇴장 이벤트
						String userId=result[1];
						jta.append(userId+" 님 퇴장 \r\n");
					}else if(msgType.equals("3")){ //참여자 목록 업데이트
						String ids=result[1]; // id1,id2,id3 ...
						String[] idList=ids.split(",");
						//참여자 목록을 JList 객체에 출력
						jlist.setListData(idList);
					}
					//아래쪽으로 스크롤 되도록
					scrollToBottom();
				}	
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(br!=null)br.close();
					if(bw!=null)bw.close();
					if(socket!=null)socket.close();
				}catch(Exception e){}
			}
			//run() 메소드 리턴하기전에 프로세스 강제 종료 
			System.exit(0);
		}//run()
		
		// 가장 아래쪽으로 스크롤 시키는 메소드
		public void scrollToBottom(){
			//JTextArea 의 길이만큼 스크롤 시키기 
			jta.setCaretPosition(jta.getDocument().getLength());
		}
		
	}//class ClientThread
}//class BroadcastClient
















