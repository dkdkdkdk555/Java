package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("체널을 올려요");
			}
			@Override
			public void down() {
				System.out.println("체널을 내려요");
			}
		};
		// useRemocon() 메소드에 Remocon type 참조값 전달 
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("온도를 올려요");
			}
			@Override
			public void down() {
				System.out.println("온도를 내려요");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}







