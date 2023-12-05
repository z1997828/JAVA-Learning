package tw.Andy.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class FoodDB {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/andy";
	private static final String SQL_QUERY = "SELECT * FROM food";

	private Connection conn;
	private ResultSet rs;
	String[] fieldNames;

	FoodDB() throws Exception {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);

		conn = DriverManager.getConnection(URL, prop);
	}

	public void queryDB() throws Exception {
		queryDB(SQL_QUERY);
	}

	public void queryDB(String sql) throws Exception {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		fieldNames = new String[rsmd.getColumnCount()];
		for(int i=0 ; i<fieldNames.length;i++) {
			fieldNames[i] = rsmd.getColumnName(i+1);
			System.out.println(fieldNames[i]);
		}
	}

	public int getRows() {

		try {
			rs.last();
			return rs.getRow();
		} catch (SQLException e) {
			return 0;
		}
	}

	public int getRCols() {
		return fieldNames.length;
	}
	
	public String getData(int row, int col) {
		try {
			rs.absolute(row);
			return rs.getString(fieldNames[col-1]);
		} catch (Exception e) {
			
			return "ERROR";
		}
		
	}
	
	public String[] getHeader()  {return fieldNames;}
	
	public void delRow() throws Exception {
		rs.deleteRow();

	}
	
	public void updateDB(int row, int col ,String value) {
		try {
			rs.absolute(row);
			rs.updateString(col, value);
			rs.updateRow();
		} catch (Exception e) {
			
		}
	}

	public void moveNewRow() {
		try {
			rs.moveToInsertRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
