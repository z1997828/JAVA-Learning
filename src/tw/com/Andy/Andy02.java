package tw.com.Andy;

import java.util.Scanner;

public class Andy02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		int result1 = a / b ;
		int result2 = a % b ;
		System.out.printf("%d / %d = %d ... %d",a,b,result1,result2);
		// printf = 按照使用者說的格式去印出
		
		// 此程式用做數字四則運算
	}

}
