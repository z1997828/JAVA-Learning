package tw.com.Andy;

import tw.Andy.classes.*;

public class Andy20 {

	public static void main(String[] args) {
		Andy20a obj1 = new Andy20a();
		Andy20b obj2 = new Andy20b();
		obj1.m1();
		obj2.m1();
		test1(obj2);
	}
	static void test1(Andy201 obj) {
		obj.m1();
;	}
}

class Andy20a implements Andy201 {
	public void m1() {System.out.println("Andy20a:m1()");}
}

class Andy20b implements Andy201 {
	public void m1() {System.out.println("Andy20b:m1()");}
	}