package test.main;

import test.mypac.Bullet;
import test.mypac.Gun;

public class MainClass10 {
	public static void main(String[] args) {
		
		Gun gun1=new Gun(new Bullet());
		gun1.fire();
		
		Gun gun2=new Gun(null);
		gun2.fire();
	}
}
