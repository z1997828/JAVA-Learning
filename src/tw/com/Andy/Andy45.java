package tw.com.Andy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import tw.Andy.classes.Student;

public class Andy45 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream("dir1/s1.Andy")));
			Object obj = oin.readObject();
			if(obj instanceof Student) {
				Student s1 = (Student)obj;
				System.out.println(s1.sum());
				System.out.println(s1.avg());
			}
			
			System.out.println("-------");
			
			Object obj2 = oin.readObject();
			if(obj2 instanceof Student) {
				Student s2 = (Student)obj;
				System.out.println(s2.sum());
				System.out.println(s2.avg());
			}
			
			oin.close();
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
