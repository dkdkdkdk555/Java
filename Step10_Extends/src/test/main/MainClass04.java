package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type
		//변수에 담기 
		SmartPhone sPhone=new SmartPhone(); 
		//이미 생성된 객체의 참조값은 부모 type 변수에 
		//다시 담을수 있다. 
		Object p1=sPhone;
		Phone p2=sPhone;
		HandPhone p3=sPhone;
	}
}












