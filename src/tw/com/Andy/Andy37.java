package tw.com.Andy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Andy37 {

	public static void main(String[] args) {
		try {
			File file = new File("dir3/file2.txt");
			FileInputStream fin = new FileInputStream(file);
			int len; byte[] buf = new byte[(int) file.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			
			fin.close();
//			System.out.println("有");
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}

	}

}
