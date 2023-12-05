package tw.com.Andy;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.Andy.classes.Andy_bike;

public class JDBC12 {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/andy";
	private static final String SQL_UPDATE = 
			"UPDATE member SET icon = ? WHERE id = ?";
	
	public static void main(String[] args) {
		Andy_bike b1 = new Andy_bike();
		b1.upSpeed(); b1.upSpeed();
		b1.upSpeed(); b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE);
			
			pstmt.setObject(1, b1);
			pstmt.setInt(2,1);
			
			
			if(pstmt.executeUpdate()>0) {
				System.out.println("UPDATE Success");
			}else {
				System.out.println("UPDATE Fail");
			}
	}catch(Exception e) {
		System.out.println(e);}
	}

}
