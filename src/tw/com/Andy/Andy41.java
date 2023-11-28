package tw.com.Andy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Andy41 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/4k.avif");
			FileOutputStream fout = new FileOutputStream("dir2/4k.avif");
			
			int b;
			while((b = fin.read()) != -1) {
				fout.write(b);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("Finish!" + (System.currentTimeMillis() - start));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
