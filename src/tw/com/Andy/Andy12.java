package tw.com.Andy;
import tw.Andy.classes.Andy_bike;
import tw.Andy.classes.Andy_Scooter;
public class Andy12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Andy_bike b1 = new Andy_bike();
		Andy_Scooter s1 = new Andy_Scooter();
		s1.changeGear(3);
		s1.upSpeed(); s1.upSpeed();
		System.out.println(s1.getSpeed());
		System.out.println(s1.getColor());
	}

}
