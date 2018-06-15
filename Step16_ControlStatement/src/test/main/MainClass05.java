package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		String[] names= {"김구라","해골","원숭이"};
		
		for(int i=0; i<names.length; i++) {
			String tmp=names[i];
			System.out.println("tmp:"+tmp);
		}
		System.out.println("--- 확장 for 문 ---");
		for(String tmp:names) {
			System.out.println("tmp:"+tmp);
		}
		
	}
}
