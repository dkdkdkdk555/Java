package test.auto;

public class MyCar extends Car{
	//생성자
	public MyCar() {
		System.out.println("MyCar() 생성자 호출됨");
	}
	
	//달리는 메소드
	public void drive() {
		System.out.println("달려요");
	}
}
