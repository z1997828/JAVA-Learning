package tw.com.Andy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC02_1 {

	public static void main(String[] args) {
// 改
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/andy",prop)){
			
			String name = "Amy";
			int id = 3;
			String tel = "123";
			String birthday = "1997-08-28";
			
			String sql = "UPDATE cust SET cname = ? WHERE id = ?";
	//		處理隱碼攻擊的API
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
	//		JAVA SQL 的Index(索引)是從1開始
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			
			int n = pstmt.executeUpdate();
			
			System.out.println(n);
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
