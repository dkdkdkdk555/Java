package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		//1. test1() 메소드를 호출해 보세요.
		MainClass01.test1();
		//2. test2() 메소드를 호출해 보세요.
		new MainClass01().test2();
	}
	// MainClass01 의 static 맴버 메소드
	public static void test1() {
		System.out.println("test1() 호출됨");
	}
	// MainClass01 의 일반(non static) 맴버 메소드 
	public void test2() {
		System.out.println("test2() 호출됨");
	}
	
}
