package tw.com.Andy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Andy58 {

	public static void main(String[] args) {
//	URL 本身為不需關閉的API
		try {
			URL url = new URL("https://miro.medium.com/v2/resize:fit:1100/format:webp/1*XEgA1TTwXa5AvAdw40GFow.png");
			URLConnection conn = url.openConnection();
			try(BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			FileOutputStream fout = new FileOutputStream("dir2/Andy.png")) {
				
			int len; byte[] buf = new byte[4*1024*1024];
			while((len = bin.read(buf)) != -1) {
				fout.write(buf,0,len);
			}
				
			fout.flush();
			fout.close();
			} 
		System.out.println("下載成功");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
