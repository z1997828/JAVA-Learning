package tw.com.Andy;


import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.Andy.classes.Andy_bike;

public class JDBC13 {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/andy";
	private static final String SQL_QUERY = 
			"SELECT * FROM member WHERE id = ?";
	
	public static void main(String[] args) {
		
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY);
			pstmt.setInt(1,1);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				InputStream in = rs.getBinaryStream("bike");
				ObjectInputStream oin = new ObjectInputStream(in);
				Object obj =  oin.readObject();
				if (obj instanceof Andy_bike) {
					System.out.println("bike");
					Andy_bike bike = (Andy_bike)obj;
					System.out.println(bike.getSpeed());
				}
				System.out.println("OK");
			}
			
	}catch(Exception e) {
		System.out.println(e);}
	}

}
