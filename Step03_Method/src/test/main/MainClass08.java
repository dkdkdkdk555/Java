package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		showSum(a, b);
		showSum(c, d);
	}
	public static void showSum(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("두수의 합:"+sum);
	}
}






