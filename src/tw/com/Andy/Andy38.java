package tw.com.Andy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Andy38 {

	public static void main(String[] args) {
		try {
			String mesg = "中國\n";
//			(,後面的布林值決定是否增加在文件後面而不是取代)
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt",true);
			
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("YESSSSS!");
		} catch (Exception e) {
			System.out.println("NOOOOOO!");
		}
	}

}
