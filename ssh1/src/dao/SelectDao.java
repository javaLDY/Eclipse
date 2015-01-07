package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfence.UserInfoInterfence;
import entity.UserInfo;

public class SelectDao implements UserInfoInterfence {

	static{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ssh;","sa","shinow");
		return conn;
	}
	@Override
	public boolean userinsert(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserInfo> userinfoselect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userupdate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserInfo> singleselect(int stucode) {
		List<UserInfo> result = new ArrayList<UserInfo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet re = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from Userinfo where login_id=?");
			pstmt.setObject(1, stucode);
			re = pstmt.executeQuery();
			while(re.next()){
				UserInfo user = new UserInfo();
				user.setLoginName(re.getString("log_name"));
				result.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				re.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	

}
