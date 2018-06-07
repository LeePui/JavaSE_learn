package quanpailie;

import java.util.Arrays;

public class Quanpailie {

	public void per(int[] arr, int start) {
		if(start == arr.length) {
			System.out.println(Arrays.toString(arr));
		}else {
			for (int i = start; i < arr.length; i++) {
				swap(arr, start, i);
				per(arr, start+1);
				swap(arr, start, i);
			}
		}
	}

	private void swap(int[] arr, int start, int i) {
		int temp = arr[start];
		arr[start] = arr[i];
		arr[i] = temp;
	}
	
}
