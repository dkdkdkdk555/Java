package test.mypac;
/*
 *  내부 클래스에서 클래스 외부에 정의된 필드나 
 *  메소드를 참조하거나 사용할수 있다. 
 */
public class BoxFactory {
	
	public String brand="한솔";
	
	public void prepare() {
		System.out.println("준비 작업을 해요");
	}
	
	public class Box{
		public void useBox(){
			System.out.println("brand:"+brand);
			prepare();
			System.out.println("박스를 사용합니다.");
		}
	}
	// Box 객체를 리턴해주는 메소드 
	public Box getBox() {
		return new Box();
	}
}


















