package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		//1. String type 을 담을수 있는 방5개짜리 배열객체를 생성
		String[] msgs=new String[5];
		//2. 배열에 5 개의 방에 각각 다른 문자열 저장하기
		msgs[0]="안녕";
		msgs[1]="어쩌구..";
		msgs[2]="저쩌구...";
		msgs[3]="하나...";
		msgs[4]="두울";
		//3. 반복문 for 를 이용해서 5 개의 방에 있는 문자열을 
		//   순서대로 콘솔창에 출력하기 
		for(int i=0; i<msgs.length; i++) {
			String tmp=msgs[i];
			System.out.println(tmp);
		}
	}
}





