package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.DB;

//DAO (Data Access Object)
public class MemberDAO {
	//회원정보삭제
	public static int memberDelete(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rows=0;
		try {
			conn = DB.oraConn();
			String sql = "delete from member where userid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return rows;
	}
}
