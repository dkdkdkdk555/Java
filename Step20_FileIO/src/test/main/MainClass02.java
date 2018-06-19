package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) {
		String path="c:/myFolder/gura.txt";
		File file1=new File(path);
		if(file1.exists()) {
			System.out.println(path+" 는 이미 존재 합니다.");
			if(file1.isFile()) {
				System.out.println(path+" 는 파일 입니다.");
			}
		}else {
			System.out.println(path+" 는 존재하지 않습니다.");
			try {
				//새 파일 만들기
				file1.createNewFile();
				System.out.println("파일을 생성했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}








