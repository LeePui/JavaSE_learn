package compara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPerson1 {
	
	public static void main(String[] args) {
		Person1 p1 = new Person1(10, "a");
		Person1 p2 = new Person1(20, "b");
		Person1 p3 = new Person1(30, "c");
		Person1 p4 = new Person1(22, "d");
		Person1 p5 = new Person1(26, "e");
		
		List<Person1> list1 = new ArrayList<Person1>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}

}
