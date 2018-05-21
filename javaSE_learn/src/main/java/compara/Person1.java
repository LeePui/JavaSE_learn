package compara;

public class Person1 implements Comparable<Person1>{

	
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Person1(int age, String name) {
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person1 [age=" + age + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Person1 o) {
		return this.age-o.age;
	}
	

}
