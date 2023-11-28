package tw.com.Andy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Andy43 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			BufferedInputStream fin = 
				new BufferedInputStream(
						new FileInputStream("dir1/4k.jpg"));
			
			BufferedOutputStream fout = 
					new BufferedOutputStream(
							new FileOutputStream("dir2/4k.jpg"));
			
			int b;
			while((b = fin.read()) != -1) {
				fout.write(b);
//				System.out.println(b;
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
