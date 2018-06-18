package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		// Map<String, Object> 를 저장할 ArrayList 객체를 생성
		// 해서 참조값을 members 라는 변수에 담아 보세요.
		List<Map<String, Object>> members=new ArrayList<>(); 
		
		// 회원3명의 정보를 담아 보세요.
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "원숭이");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "상도동");
		
		//ArrayList 객체에 담기
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		//데이터 참조
		List<Map<String,Object>> a=members;
		Map<String,Object> b=members.get(0);
		int c=(int)members.get(0).get("num");
		String d=(String)members.get(0).get("name");
		String e=(String)members.get(0).get("addr");
	}
}











