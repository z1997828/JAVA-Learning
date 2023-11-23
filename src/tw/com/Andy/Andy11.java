package tw.com.Andy;
import tw.Andy.classes.Andy_bike;
public class Andy11 {

	public static void main(String[] args) {
		Andy_bike b1 = new Andy_bike();
		System.out.println(b1.getSpeed());
		// b1.getSpeed = 10.1;
		// 因為speed是public 所以可以可以直接存取，但這是不允許的
		System.out.println(b1.getSpeed());
		
		
	}

}
