package tw.com.Andy;

import java.io.File;

public class Andy36 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
//		. = this 這個
//		.. = 上一個、上一頁
		
		File f1 = new File("./dir3");
		if(!f1.exists()) {
			f1.mkdir();
		}else {
			System.out.println("文件已存在");
		}
		System.out.println("-----------");
		File f2 = new File("./dir2/file1.txt");
		File f3 = new File("./dir3/file2.txt");
		if (f2.renameTo(f3)) {
			System.out.println("ok");
		}else {
			System.out.println("不 ok");
		}
		
		
		
		
		
	}

}
