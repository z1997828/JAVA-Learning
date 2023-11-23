package tw.com.Andy;

import java.util.HashSet;

import java.util.Iterator;

public class Andy30 {
// Collection SET 特徵 1. 不重複 2.無順序性

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Andy");
		set.add(123); // auto-boxing <> auto-unboxing
		set.add(true);
		set.add(12.3);
		System.out.println(set.size());
		set.add(123);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("------------");
		
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	
		

	}

}
