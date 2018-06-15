package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		// Car 객체를 담을수 있는 방 3개 짜리 배열객체 생성
		Car[] cars=new Car[3];
		// 각각의 방에 Car 객체를 생성해서 참조값 저장 
		cars[0]=new Car("소나타");
		cars[1]=new Car("프라이드");
		cars[2]=new Car("그랜져");
		
		for(int i=0; i<cars.length; i++) {
			// i 번째 Car 객체의 참조값 얻어와서 
			Car tmp=cars[i];
			// 메소드 호출해 보기 
			tmp.drive();
		}
		System.out.println("--- 확장 for 문 ---");
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}






