package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//생성자의 인자로 OutputStream 객체를 전달해서
		//OutputStreamWriter 객체 생성하기 
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		try {
			osw.write("abcd 1234 한글도 출력되네?");
			osw.flush();
			// 방5개짜리 char[] 객체를 생성해 보세요.
			char[] b=new char[5];
			// 각각의 방에 char type 대입
			b[0]='A';
			b[1]='B';
			b[2]='C';
			b[3]='D';
			b[4]='E';
			// char[] 객체를 전달해서 
			osw.write(b);
			osw.flush(); //출력하기 
			
			System.out.println(); //개행
			
			osw.write(b, 0, 3);
			osw.flush();
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}













