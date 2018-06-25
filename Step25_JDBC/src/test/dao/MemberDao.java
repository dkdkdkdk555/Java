package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 *  Dao => Data Access Object 
 *  
 *  - 회원정보에 대해서  SELECT, INSERT, UPDATE, DELETE 작업을 
 *    수행할 객체를 생성하기 위한 클래스 정의하기
 *  - Application 전역에서 MemberDao 객체는 오직1개만 생성될수 
 *    있도록 설계한다. 
 */
public class MemberDao {
	//1. 자신의 Type 을 private static 맴버필드로 정의한다.
	private static MemberDao dao;
	//2. 외부에서 객체 생성할수 없도록 생성자의 접근 지정자를 
	//   private로 지정
	private MemberDao(){}
	//3. 자신의 참조값을 리턴해주는 static 멤버 메소드를 정의한다.
	public static MemberDao getInstance(){
		if(dao==null){//최초 호출될때는 null 임으로
			dao=new MemberDao(); //객체를 생성해서 필드에 저장한다.
		}
		//필드에 저장된 참조값을 리턴해준다.
		return dao;
	}
	//회원정보를 저장하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		// 영향을 받은 row 의 갯수를 저장할 지역 변수
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기 
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member (num,name,addr) "
					+ "VALUES(?, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			flag=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//작업 성공 여부 리턴해주기 
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		return false;
	}
	//회원정보를 삭제하는 메소드
	public boolean delete(int num) {
		return false;
	}
	//회원 한명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		return null;
	}
	//회원 목록을 리턴하는 메소드
	public List<MemberDto> getList(){
		return null;
	}
}















