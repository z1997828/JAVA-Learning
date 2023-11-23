package tw.com.Andy;

import java.util.Scanner;

public class Andy06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入月份:");
		int Month = scanner.nextInt();
		switch(Month) {
		case 1,3,5,7,8,10,12 :
			System.out.printf("%d%s",Month,"月是31天");
		break;
		case 2 :
			System.out.printf("%d%s",Month,"月是28天");
		break;
		case 4,6,9,11 :
			System.out.printf("%d%s",Month,"月是30天");
		break;
		
		
		
		
		
		
		} 

	}

}
