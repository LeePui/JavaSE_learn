package compara;

public class Person2 {
	
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

	public Person2(int age, String name) {
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person1 [age=" + age + ", name=" + name + "]";
	}

}
