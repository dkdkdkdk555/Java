package test.mypac;

public class Car {
	//필드정의
	public String name;
	
	//생성자
	//생성자는 return type 이 없고 클래스명과 동일하다 
	public Car() {
		System.out.println("Car() 생성자 호출됨");
	}
	//인자로 String type 을 전달받는 생성자
	public Car(String name) {
		//생성자의 인자로 전달되는 값을 필드에 저장하기
		this.name=name;
		System.out.println("Car(String name) 생성자 호출됨");
	}
	
	//메소드
	public void drive() {
		System.out.println(this.name+" 이(가) 달려요!");
	}
}












