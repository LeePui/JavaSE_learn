package autounboxing;
/**
 * 自动拆装箱，integer的valueOf方法里保存了
 * @author 李拜天
 *
 */
public class IntegerTest {
	
	public static void main(String[] args) {
		Integer n1 = 1000000;
        Integer n2 = 1000000;
        System.out.println(1000000 == n1);
        System.out.println(n1.equals(n2));
        System.out.println(n1 == n2);

        Integer n3 = 100;
        Integer n4 = 100;
        System.out.println(n3.equals(n4));
        System.out.println(n3 == n4);

        Integer n5 = new Integer(10);
        Integer n6 = 10;
        System.out.println(n5.equals(n6));
        System.out.println(n5 == n6);
	}

}
