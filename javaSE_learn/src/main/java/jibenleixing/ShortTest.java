package jibenleixing;

public class ShortTest {
	
	public static void main(String[] args) {
		short s1 = 1;
		s1 = (short) (s1 + 1);
		/**
		 * s1 + 1;因为1是Int类型，所以是会报错的
		 */
		s1 += 1;
	}

}
