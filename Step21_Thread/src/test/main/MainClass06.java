package test.main;

import test.mypac.MyRunnable;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");
		
		//한줄의 코드로 간단히 시작 시키려면...
		new Thread(new MyRunnable()).start();
		
		System.out.println("main 스레드가 종료 됩니다.");
	}
}








