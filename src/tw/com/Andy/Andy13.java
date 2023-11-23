package tw.com.Andy;

import tw.Andy.classes.Andy_Scooter;

public class Andy13 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97,98,99,100};
		String s2 = new String(b1);
		String s3 = new String(b1,1,2);
		Andy_Scooter s4 = new Andy_Scooter();
//		 System.out.println(s4);
		// 印出s4的記憶體位置
		// 改寫 toString方法可以改變顯示的內容
		// System.out.println(s2);
		// 印出 ascii code
	}	//

}
