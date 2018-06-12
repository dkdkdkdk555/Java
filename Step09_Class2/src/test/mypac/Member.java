package test.mypac;

public class Member {
	// 필드
	public int num;
	public String name;
	public String addr;
	// default 생성자
	public Member() {
		
	}
	// 인자로 3개를 전달 받는 생성자 
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}
