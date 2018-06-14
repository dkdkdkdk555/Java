package test.main;

// import 가능 (public class Radio)
import test.mypac.Radio;

public class MainClass01 {
	public static void main(String[] args) {
		//생성자 호출 가능( public Radio(){} )
		Radio r=new Radio();
		//메소드 호출 가능( public void channelUp(){} )
		r.channelUp();
		//필드 접근 가능( public int volumn )
		int result=r.volumn;
	}
}







