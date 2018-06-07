package extend;

public class Father1 {
	
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void publicMethod() {
		System.out.println("i am publicMethod");
	}
	private void privateMethod() {
		System.out.println("i am privateMethod");
	}
	
	public static void staticMethod() {
		System.out.println("i am staticMethod");
	}
	
	@Override
	public String toString() {
		return "Son1 [name=" + name + ", age=" + age + "]";
	}
}
