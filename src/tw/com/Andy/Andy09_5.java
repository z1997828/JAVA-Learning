package tw.com.Andy;
import java.util.ArrayList;
import java.util.Collections;
public class Andy09_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> poker = new ArrayList<>();
		for (int i=0; i<10; i++) poker.add(i);
		Collections.shuffle(poker);
		for (Integer v : poker)System.out.println(v);
	
	}

}
