package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			//오라클 드라이버 로딩 (ojdbc6.jar 있어야함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//@접속ip주소:port번호:DB이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//.getConnection(url, 계정, 비밀번호) 
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Oracle DB 접속 성공!");
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		// [ member 테이블에 update 수행하기 ]
		
		//수정할 회원의 정보 
		int num=1;
		String name="이정호";
		String addr="아현동";
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		try {
			String sql="UPDATE member SET name=?,addr=? "
					+ "WHERE num=?";
			//sql 문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql);
			// ? 에 값 바인딩하기
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			// sql 문 수행하기
			pstmt.executeUpdate();
			System.out.println("회원정보가 수정되었습니다.");
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}




















