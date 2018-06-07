package jihe;
/**
 * 测试没有重写hashcode时相同值对象hashcode的值
 * @author 李拜天
 *
 */
public class TestHashcode {
	
	public static void main(String[] args) {
		Person a = new Person(1, "a");
		Person b = new Person(1, "a");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}

class Person {
	int a;
	String b;
	
	public Person(int a, String b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "person [a=" + a + ", b=" + b + "]";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
}