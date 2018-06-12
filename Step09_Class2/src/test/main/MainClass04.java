package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car 객체를 담을수 있는 방3개짜리 배열객체를 생성해서
		Car[] cars=new Car[3];
		//2. 배열의 각각의 방에 차이름이 
		//   "소나타", "프라이드", "그랜져" 인 Car 객체의 참조값을
		//   저장하고
		cars[0]=new Car("소나타");
		cars[1]=new Car("프라이드");
		cars[2]=new Car("그랜져");
		//3. for 문을 이용해서 배열에 저장된 Car 객체의 
		//   drive() 라는 메소드를 순서대로 호출해 보세요.
		for(int i=0; i<cars.length; i++) {
			Car tmp=cars[i];
			tmp.drive();
		}
	}
}






