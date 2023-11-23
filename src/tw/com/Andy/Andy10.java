package tw.com.Andy;

public class Andy10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 3;
//		int temp =  a;
//		a = b;
//		b = temp;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("a = %d,b = %d",a,b);
	}

}
