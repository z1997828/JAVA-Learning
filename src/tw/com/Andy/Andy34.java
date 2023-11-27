package tw.com.Andy;

public class Andy34 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] c = {1,2,3,4};
		
		System.out.println("Andy");
		// try... catch 程式遇到錯誤則跳過繼續跑程式
		try {
		System.out.println(a / b);
		System.out.println(c[4]);
//		}catch(ArithmeticException e) {
//			System.out.println("算式有誤!");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index太大啦");
		}catch(RuntimeException e) {
//		RuntimeException 內有包含以上兩個，和順序有關，級比較高的應該放下面，
//			不然程式會報錯跟你說上面執行完了下面就沒用了
			System.out.println("Error!");
		}
		
		
		System.out.println("Finish");
		
		// 除以零會被拋出例外
		// 將 int 改成 double
		// double 會精算結果 ，所以答案是無限大
		// 浮點 0 除以 0 會變成 NaN
	}

}
