package test.main;

import test.mypac.MyRunnable;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");
		//Runnable 인터페이스를 구현한 클래스로 객체 생성
		Runnable run1=new MyRunnable();
		//Thread 클래스의 생성자로 Runnable type 전달
		Thread t1=new Thread(run1);
		//Thread 객체의 start() 메소드를 이용해서 스레드 시작시키기
		t1.start();
		
		System.out.println("main 스레드가 종료 됩니다.");
	}
}








