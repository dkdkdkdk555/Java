package test.mypac;
/*
 *  회원 한명의 정보를 담을수 있는 객체를 생성하기 위한
 *  클래스 정의하기 
 *  
 *  dto => Data Transfer Object 의 약자
 *  
 *  dto 클래스 작성 방법
 *  
 *  1. 필드의 접근 지정자를 private 로 지정해서 만든다.
 *  2. default 생성자와 인자로 필드값을 전달받는 생성자를 만든다.
 *  3. 모든 필드에 대해서 setter 메소드를 정의한다.
 *  4. 모든 필드에 대해서 getter 메소드를 정의한다. 
 */
public class MemberDto {
	//필드
	private int num;
	private String name;
	private String addr;
	//생성자
	public MemberDto() {}
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}

















