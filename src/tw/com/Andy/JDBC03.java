package tw.com.Andy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class JDBC03 {

	public static void main(String[] args) {
//	URL 本身為不需關閉的API
		try {
			URL url = new URL("https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			URLConnection conn = url.openConnection();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
				String line;
				StringBuffer sb = new StringBuffer();
				while ((line = reader.readLine()) != null) {
					sb.append(line);

				}
				parseJSON(sb.toString());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static void parseJSON(String json) {

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/andy", prop)) {
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("DELETE FROM food");
			
			stmt.executeUpdate("ALTER TABLE food AUTO_INCREMENT = 1");
			
			
			String sql = "INSERT INTO food(name,addr,tel,pic,lat,lng) VALUE(?,?,?,?,?,?)";
			// 處理隱碼攻擊的API
			PreparedStatement pstmt = conn.prepareStatement(sql);

			JSONArray root = new JSONArray(json);
			System.out.println(root.length());
			for (Object row : root) {
				JSONObject data = (JSONObject) row;
				String name = data.getString("Name");
				String addr = data.getString("Address");
				String tel = data.getString("Tel");
				String pic = data.getString("PicURL");
				String lat = data.getString("Latitude");
				String lng = data.getString("Longitude");

				pstmt.setString(1, name);
				pstmt.setString(2, addr);
				pstmt.setString(3, tel);
				pstmt.setString(4, pic);
				try {
					pstmt.setDouble(5, Double.parseDouble(lat));
					pstmt.setDouble(6, Double.parseDouble(lng));
				} catch (Exception e) {
					pstmt.setDouble(5, 0.0);
					pstmt.setDouble(6, 0.0);
				}
				pstmt.executeUpdate();
			}
				
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
