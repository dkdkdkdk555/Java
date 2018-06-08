package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		showMsg();
		// getNum() 메소드 호출하고 리턴되는 데이터를 변수에 담기
		int result=getNum();
		// isMan() 메소드 호출하고 리턴되는 데이터를 변수에 담기
		boolean result2=isMan();
	}
	// return type 이 없는 메소드 (void)
	public static void showMsg() {
		System.out.println("showMsg() 호출됨");
	}
	// return type 이 int 인 메소드 
	public static int getNum() {
		System.out.println("getNum() 호출됨");
		return 999;
	}
	// return type 이 boolean 인 메소드
	public static boolean isMan() {
		System.out.println("isMan() 호출됨");
		return true;
	}
}












