package tw.com.Andy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Andy42 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/4k.avif");
			FileOutputStream fout = new FileOutputStream("dir2/4k.avif");
			
			int len; byte[] buf = new byte[4*1024];
			while((len = fin.read(buf)) != -1) {
				fout.write(buf,0,len);
//				System.out.println(len);
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
