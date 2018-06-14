package test.main;

import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  SmartPhone 객체를 생성해서 참조값을 
		 *  SmartPhone type 변수에 담기 
		 */
		SmartPhone p1=new SmartPhone();
		// Phone 클래스에 정의된 기능
		p1.call();
		// HandPhone 클래스에 정의된 기능
		p1.mobileCall();
		p1.takePicture();
		// SmartPhone 클래스에 정의된 기능
		p1.doInternet();
	}
}







