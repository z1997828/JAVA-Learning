package tw.com.Andy;

public class Andy04 {

	public static void main(String[] args) {
		double temp = Math.random();
//		System.out.println(temp);
		int score = (int)(temp * 101); // 101,49代表數字的個數; +1代表從1開始
//		System.out.println(score);
		if(score >= 90) {
			System.out.printf("%d : %s",score,"A");
		}else if(score >= 80) {
			System.out.printf("%d : %s",score,"B");
		}else if(score >= 70) {
			System.out.printf("%d : %s",score,"C");
		}else if(score >= 60) {
			System.out.printf("%d : %s",score,"D");
		}else {
			System.out.printf("%d : %s",score,"E");
		}
		// JAVA的IF () 只能是布林值，也就是TRUE或FALSE
		// 當敘述句只有一道時，else 和 if 之間不需要 {}
	}

}
