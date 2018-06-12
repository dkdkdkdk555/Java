package test.main;

import test.auto.Car;

public class MainClass08 {
	public static void main(String[] args) {
		// Car type 을 담을수 있는 방5개짜리 배열 객체를 생성해 보세요.
		Car[] cars=new Car[5];
		// 0 번방에 Car 객체의 참조값을 대입해 보세요.
		cars[0]=new Car();
		// 1 번방에 Car 객체의 참조값을 대입해 보세요.
		cars[1]=new Car();
		// Car 객체를 생성해서 참조값을 변수에 담기 
		Car c=new Car();
		// 2 번방과 3번방에 c 라는 변수에 있는 참조값을 대입
		cars[2]=c;
		cars[3]=c;
		// 0 번방에 있는 참조값을 4 번방에 대입
		cars[4]=cars[0];
		
	}
}










