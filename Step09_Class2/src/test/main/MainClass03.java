package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  new Car() 는 Car 클래스의 생성자(constructor) 를 
		 *  호출하는 표현식이다.
		 */
		Car c1=new Car();
		Car c2=new Car("소나타");
		Car c3=new Car("프라이드");
		
		// 생성된 3개 객체의 메소드 각각 호출하기 
		c1.drive();
		c2.drive();
		c3.drive();
	}
}















