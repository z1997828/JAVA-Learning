package tw.com.Andy;

public class Andy35 {

	public static void main(String[] args ) {
		Bird bird = new Bird();
		try {
			bird.setLeg(2);
			System.out.println("開飛");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		System.out.println("---分隔---");
		test1(bird);
	}
	
	static void test1(Bird bird) {
		try {
		test2(bird);
		System.out.println("test1():ok");
		}catch(Exception e) {
			System.out.println("test1():不ok");
			return; 
//		finally = 無論如何一定會做
		}finally {
			System.out.println("finally");
		}
		System.out.println("test1():Finish");
	}
	static void test2(Bird bird) throws Exception  {
		bird.setLeg(4);
	}
}

class Bird {
	int leg;
	// 此段為預先宣告可能會有東西被拋出
	void setLeg(int num) throws Exception {
		if(num >= 0 && num <= 2) {
		leg = num;
		} else {
			throw new Exception();
		}
	}
}
