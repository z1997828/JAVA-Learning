package tw.com.Andy;

public class Andy14 {

	public static void main(String[] args) {
		String s1 = "Brad";
		System.out.println("Brad".charAt(2));
		// " " 內的是物件，所以可以引用方法
		String s2 = "Brad";
		// String 設定的字串如果一樣會占用一樣的記憶體位置，不會new一個新的
		String S3 = new String("Brad");
		String S4 = new String("Brad");
		System.out.println(s1 == s2);
		//s1 == s2 比較這段是在比物件在記憶體內的位置
		//s3、s4的位置則都不會相同
		//傳值、傳址
		//如果只是要比字串內容需要使用.equals
		System.out.println(S4.equals(S3));

	
	}

}
