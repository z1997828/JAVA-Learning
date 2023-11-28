package tw.com.Andy;


import java.io.FileReader;

public class Andy39 {

	public static void main(String[] args) {
		try {
//			reader 適合讀文字資料
			FileReader reader = new FileReader("dir3/file2.txt");
			
			int c;
			while (( c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("傳遞失敗");
		}

	}

}
