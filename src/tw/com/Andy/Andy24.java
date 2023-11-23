package tw.com.Andy;

public class Andy24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Andy241 obj1 = new Andy242();
		Andy241 obj2 = new Andy241() {
			void m2() {	
				
			}	
		};
		
	}

}
// 抽象類別，做的時候需要先宣告這是抽象類別
abstract class Andy241{
	void m1() {}
	abstract void m2();
}

class Andy242 extends Andy241{
//  m2是抽象方法，所以這邊將它實際做出來
	void m2() {	
	}	
}

class Andy243 extends Andy241{
	void m2() {	
	}	
}
