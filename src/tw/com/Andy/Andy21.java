package tw.com.Andy;

public class Andy21 {
	public static void main(String[] args) {
//		Andy211 obj1 = new Andy211();
//		Andy211 obj2 = new Andy212();
//		Andy212 obj3 = new Andy212();
//		Andy212 obj4 = (Andy212)obj2;
//		obj4.m2();
//		Andy212 obj5 = (Andy212)obj1;
	}
	
class Andy211 {
	void m1() {System.out.println("Andy211:m1()");}
}

class Andy212 extends Andy211 {
	void m1() {System.out.println("Andy212:m1()");}
	void m2() {System.out.println("Andy212:m2()");}
}

class Andy213 extends Andy211 {
	void m1() {System.out.println("Andy213:m1()");}
	void m2() {System.out.println("Andy213:m2()");}
	void m3() {System.out.println("Andy213:m3()");}
}

}
