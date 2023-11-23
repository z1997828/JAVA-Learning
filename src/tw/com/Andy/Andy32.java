package tw.com.Andy;

import java.util.LinkedList;

public class Andy32 {

	public static void main(String[] args) {
//	List 可重複、有順序性
// ArrayList 如果資料不變則使用這個效能比較好
// Linkedlist 
		LinkedList<String> list = new LinkedList<String>();
		list.add("Brad");
		list.add("Andy");
		// (位置,資料) 位置從0開始
		list.add(0,"Peter");
		list.add("Steven");
		System.out.println(list.size());
		System.out.println(list);
		list.add("Steven");
		System.out.println(list.size());
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------");
		for (String name : list) {
			System.out.println(name);
		}
		
		
		
	}

}
