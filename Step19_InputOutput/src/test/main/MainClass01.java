package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 *  [ InputStream ]
 *  - 1byte 처리 스트림(byte 알갱이의 흐름)
 *  - 문자의 경우는 영문자 대소문자, 숫자, 특수문자 
 *    한글자를 읽어들일수 있다.
 *  - 한글은 처리 불가  
 */
public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 키보드로 부터 한개의 글자 코드를 입력 받아서 
		 * 해당 코드에 대응되는 문자 한개 출력하기 
		 */
		InputStream is=System.in;
		System.out.print("한글자 입력:");
		try {
			//키보드로 부터 입력받은 코드값 읽어오기 
			int code=is.read();
			System.out.println("code:"+code);
			//code 에 해당되는 문자 
			char ch=(char)code;
			System.out.println("char 로 변환된값:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

















