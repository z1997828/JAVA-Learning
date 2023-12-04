package tw.com.Andy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBC04 {

	public static void main(String[] args) {
		
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try  {
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/andy", prop);
			String sql = "SELECT *  FROM food";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			// 撈資料時可以由自己決定型別，比如這邊就把原本是INT的id轉成字串
				String id = rs.getString("id");
				String name = rs.getString("name");
				String lat = rs.getString("lat");
				String lng = rs.getString("lng");
				System.out.printf("%s : %s : %s: %s\n",id,name,lat,lng);
			}
			
			conn.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
