package test.mypac;

public class AppleBox {
	//Apple 객체를 저장할 맴버필드
	private Apple item;
	//Apple 객체를 필드에 저장하는 메소드 
	public void push(Apple item) {
		this.item=item;
	}
	//필드에 저장된 Apple 객체를 리턴해 주는 메소드 
	public Apple pull() {
		return item;
	}
}
