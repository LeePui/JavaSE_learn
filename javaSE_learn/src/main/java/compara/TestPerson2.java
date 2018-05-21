package compara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestPerson2 {
	
	public static void main(String[] args) {
		Person2 p1 = new Person2(10, "a");
		Person2 p2 = new Person2(20, "b");
		Person2 p3 = new Person2(30, "c");
		Person2 p4 = new Person2(22, "d");
		Person2 p5 = new Person2(26, "e");
		
		List<Person2> list1 = new ArrayList<Person2>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		
		System.out.println(list1);
		Collections.sort(list1, new Comparator<Person2>() {

			@Override
			public int compare(Person2 o1, Person2 o2) {
				return o1.getAge()-o2.getAge();
			}
			
			
		});
		
		System.out.println(list1);
	}

}
