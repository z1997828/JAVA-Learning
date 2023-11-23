package tw.com.Andy;

public class Andy07 {

	public static void main(String[] args) {
//		for迴圈
		int x = 0;
		for(printAndy() ; x < 10 ; printLine()) {  // x < 10 這段如果不寫則會形成無窮迴圈
		// ; ; 除了中間都有其他方法可以省略不做
		// 被省下來的位置可以做其他事，比如將方法加進去，一號位代表初始一定做的，三號位代表每次都會做的事
		// 在for loop迴圈內宣告變數則該變數的生命只會在迴圈內，外面就可以重複宣告了，但不建議
			System.out.println(x++);
			}
			
	}
	static void printAndy() {
		System.out.println("Andy");
	}
	static void printLine() {
		System.out.println("---------------");
	}
	
}
