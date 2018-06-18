package test.main;

import test.mypac.Car;

/*
 *   비교 연산자
 *   
 *   ==, != 에 대한 이해!
 *   
 *   비교 연산자는 실제 값을 비교하는 연산자
 *   
 */
public class MainClass07 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		int num3=20;
		//기본 데이터 type 을 비교 
		boolean result1=num1==num2; //true
		boolean result2=num1==num3; //false
		
		Car car1=new Car("소나타");
		Car car2=new Car("소나타");
		Car car3=car1;
		
		//참조 데이터 type 을 비교 
		boolean result3=car1==car2; //false
		boolean result4=car1==car3; //true
		
		//문자열 비교? 
		String name1="김구라";
		String name2="김구라";
		String name3="이정호";
		
		String name4=new String("김구라");
		String name5=new String("김구라");
		String name6=new String("이정호");
		
		//문자열의 내용을 비교할때는 .equals() 메소드를 사용한다.
		boolean result5=name1.equals(name2);//true
		boolean result6=name1.equals(name4);//true
		boolean result7=name1.equals(name6);//false
		boolean result8=name1.equals("김구라");//true
		boolean result9=name1.equals("이정호");//false
		boolean result10="김구라".equals(name1);//true
	}
}















