package tw.com.Andy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC14 {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/andy";
	private static final String SQL_QUERY = 
			"SELECT * FROM cust";
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(
					SQL_QUERY,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE
					);
		
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				System.out.printf("%s : %s\n",id,cname);
				System.out.println("--------");
				}
			if(rs.first()) {
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				System.out.printf("%s : %s\n",id,cname);
				
				rs.absolute(4);
				id = rs.getString("id");
				cname = rs.getString("cname");
				System.out.printf("%s : %s\n",id,cname);
				
				rs.updateString("cname","Tony");
				rs.updateString("tel","4567");
				rs.updateRow();
				System.out.println("--------");
				rs.absolute(2);
//				rs.deleteRow();
				System.out.println("--------");
				rs.moveToInsertRow();
				rs.updateString("cname","FLASH");
				rs.updateString("tel","4567");
				rs.updateString("birthday","2000-01-01");
				rs.insertRow();
				System.out.println("GOOD INSERT");

			}else {
				System.out.println("XX");
			}
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
