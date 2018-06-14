package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone type 객체를 생성해서 Object type 변수에 담기
		Object p1=new SmartPhone();
		// Phone 으로 casting 해서 대입
		Phone p2=(Phone)p1;
		// HandPhone 으로 casting 해서 대입
		HandPhone p3=(HandPhone)p1;
		// SmartPhone 으로 casting 해서 대입
		SmartPhone p4=(SmartPhone)p1;
	}
}













