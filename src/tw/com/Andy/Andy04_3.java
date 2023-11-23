package tw.com.Andy;

import java.util.Scanner;

public class Andy04_3 {
	//閏年判斷，能被4整除，不能被100整除，除非是被400整除
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Years = ");
		int Years = scanner.nextInt();
//		if(Years % 4 == 0 && Years % 100 != 0 || Years % 400 == 0) {
//			System.out.printf("%d%s",Years,"是閏年");
//		}else {
//			System.out.printf("%d%s",Years,"是平年");
//			}
		if(Years % 4 == 0) {
			if(Years % 100 != 0) {
				if(Years % 400 ==0) {
					
				}else {
					
				}
			}else {
				
			}
		}else {
			
		}
		
		
		
		
		
		
		
		
	}
}