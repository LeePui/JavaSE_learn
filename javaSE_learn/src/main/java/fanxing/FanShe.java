package fanxing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * 用反射来看泛型的机制
 * 在程序中定义了一个ArrayList泛型类型实例化为Integer的对象，如果直接调用add方法，
 * 那么只能存储整形的数据。不过当我们利用反射调用add方法的时候，却可以存储字符串。这说明了Integer泛型实例在编译之后被擦除了，只保留了原始类型。
 * @author LeePui
 *
 */
public class FanShe {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.getClass().getMethod("add", Object.class).invoke(l1, "aaaa");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}

}
