package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		// int type 을 담을수 있는 방5개짜리 배열 객체 생성해서
		// 참조값을 변수에 담기
		// 각각의 방에는 0 이 들어 있다. 
		int[] nums=new int[5];
		
		//0번방 참조해서 값 대입하기
		nums[0]=10;
		//1번방 참조해서 값 대입하기
		nums[1]=20;
		//2번방 참조해서 값 대입하기
		nums[2]=30;
		
		//방의 크기 참조하기
		int size=nums.length;
		
	}
}






