package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//파일에서 입력 받을수 있는 스트림 객체 
			fis=new FileInputStream("c:/myFolder/myImage.jpg");
			//파일에 출력할수 있는 스트림 객체 
			fos=new FileOutputStream("c:/myFolder/copiedImage.jpg");
			
			//byte[] 배열객체 생성
			byte[] buffer=new byte[1024]; 
			//반복문 돌면서 byte[] 객체를 이용해서 읽어들이고 
			while(true){
				int readedCount=fis.read(buffer);
				//더이상 읽을게 없으면 반복문 탈출
				if(readedCount==-1)break;
				//읽은 만큼 파일에 출력하기
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 복사 했습니다.");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//finally 절에서 마무리 작업
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
