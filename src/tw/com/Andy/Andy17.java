package tw.com.Andy;

import tw.Andy.classes.TWId;

public class Andy17 {

	public static void main(String[] args) {
		
		TWId myId = TWId.createTWId("A123456789");
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(7);
		TWId id4 = new TWId(true,26);
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
//		if (TWId.isRightID("A172542325")) {
//			System.out.println("是身分證");
//		}else {
//			System.out.println("不是身分證");
//		}
		

	}

}
