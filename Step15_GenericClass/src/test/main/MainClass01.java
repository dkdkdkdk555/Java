package test.main;

import test.mypac.Apple;
import test.mypac.AppleBox;
import test.mypac.Banana;
import test.mypac.BananaBox;
import test.mypac.Orange;
import test.mypac.OrangeBox;

public class MainClass01 {
	public static void main(String[] args) {
		//Apple 객체를 담을려면?
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		//Banana 객체를 담으려면
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		//Orange 객체를 담으려면?
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
		
		
	}
}









