package tw.com.Andy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Andy57 {

	public static void main(String[] args) {
//	URL 本身為不需關閉的API
		try {
			URL url = new URL("https://www.ispan.com.tw");
			URLConnection conn = url.openConnection();
			try(BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
				String line;
				while((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				
			} 
				
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
