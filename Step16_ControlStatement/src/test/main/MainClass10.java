package test.main;

import java.util.Scanner;

public class MainClass10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		while(true) {
			System.out.print("문자열 입력(종료:q) :");
			String msg=scan.nextLine();
			if(msg.equals("q")) {// q 를 입력 했다면
				//반복문 탈출 
				break;
			}
			System.out.println("입력한 문자열:"+msg);
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}







