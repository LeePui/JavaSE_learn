package fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型擦除
 * Java中的泛型基本上都是在编译器这个层次来实现的。在生成的Java字节码中是不包含泛型中的类型信息的。使用泛型的时候加上的类型参数，会在编译器在编译的时候去掉。这个过程就称为类型擦除。
 * @author LeePui
 *
 */
public class LeixingCaChu {
	
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("s");
		List<Integer> l2 = new ArrayList<>();
		l2.add(2);
		System.out.println(l1.getClass() == l2.getClass());	//true

	}

}
