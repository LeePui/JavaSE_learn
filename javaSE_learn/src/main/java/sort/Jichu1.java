package sort;

import java.util.Arrays;

public class Jichu1 {
	
	
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(ar));
		
		int i = 2;
		ar[i++] = ar[0];
		System.out.println(i);
		System.out.println(Arrays.toString(ar));
		
	}

}
