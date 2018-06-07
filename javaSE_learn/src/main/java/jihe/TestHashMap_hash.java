package jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashMap_hash {
	public static void main(String[] arg) {
		Collection<Personn> cp = new HashSet<Personn>();
		Personn p1 = new Personn(1, "a");
		Personn p2 = new Personn(1, "a");
		cp.add(p1);
		cp.add(p2);
		Iterator<Personn> it = cp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
class Personn {
	int a;
	String b;
	
	public Personn(int a, String b) {
		this.a = a;
		this.b = b;
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
	@Override
	public String toString() {
		return "Personn [a=" + a + ", b=" + b + "]";
	}
	
}