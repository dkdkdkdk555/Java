package test.mypac;

public class SmartPhone extends HandPhone{
	
	//인터넷을 하는 메소드 
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	//takePicture() 메소드 재정의(오버라이드) 하기 
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}







