package test.main;

import java.io.File;

/*
 *  c:\ 경로에 myFolder 라는 이름의 폴더를 만드는 예제
 *  
 *  - 확인해서 myFolder 가 없으면 만들고 있으면 안만들기 
 */
public class MainClass01 {
	public static void main(String[] args) {
		String path="c:/myFolder";
		//File 객체 생성하면서 경로 전달
		File f=new File(path);
		
		if(f.exists()) {//존재하면
			System.out.println(path+"는 이미 존재 합니다.");
			if(f.isDirectory()) {
				System.out.println(path+"는 디렉토리 입니다.");
			}
		}else {//존재하지 않으면
			//디렉토리 만들기 
			f.mkdir();
			System.out.println(path+" 폴더를 만들었습니다.");
		}
	}
}


















