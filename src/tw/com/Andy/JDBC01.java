package tw.com.Andy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC01 {

	public static void main(String[] args) {
		// Load Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("連接成功");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		try {
//		登入mysql的辦法 
//		第一招
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://127.0.0.1:3306/andy?user=root&password=root");
//		第二招
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://127.0.0.1:3306/andy","root","root");
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/andy",prop);
			
			
			Statement stmt = conn.createStatement();
			// 數字寫入不用引號，其他都要 
			String sql = "DELETE FROM customer" ;
			
			// 上方第一筆用VALUES 後面每筆()前面用,來新增多筆資料
			int n = stmt.executeUpdate(sql);
			
			System.out.println(n);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
