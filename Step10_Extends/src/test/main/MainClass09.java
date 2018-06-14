package test.main;

import test.auto.MyCar;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작됨");
		/*
		 *  MyCar 클래스의 생성자를 호출하면 
		 *  부모 클래스인 Car 클래스의 생성자가 
		 *  자동으로 먼저 호출된다.
		 */
		MyCar car=new MyCar();
		
	}
}










