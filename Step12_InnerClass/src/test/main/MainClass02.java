package test.main;

import test.mypac.Bakery;
import test.mypac.Bakery.Bread;
import test.mypac.Bakery.Cake;

public class MainClass02 {
	public static void main(String[] args) {
		// Bakery 객체 생성해서 참조값을 변수에 담기 
		Bakery b=new Bakery();
		
		// Bakery 객체를 이용해서 Bread 객체의 참조값 얻어오기
		Bread bread=b.getBread();
		// Bakery 객체를 이용해서 Cake 객체의 참조값 얻어오기
		Cake cake=b.getCake();
		
		//각각의 메소드 호출하기 
		bread.eat();
		cake.eat();
	}
}












