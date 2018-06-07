package sort;

import java.util.Arrays;

/**
 * 快排，第二天加强印象
 * 升序排序
 * @author 李拜天
 *
 */
public class QuickSort4 {
	
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	private static void sort(int[] arr, int low, int hight) {
		int i, j, index;
		if(low >= hight) {	//记住这里有等号
//			System.out.println("low: " + low + " hight: " + hight);
			return;
		}
		i = low; j = hight; index = arr[i];
		while(i < j) {
			while(i < j && arr[j] > index)
				j--;
			if(i < j)
				arr[i++] = arr[j];
			while(i < j && arr[i] < index)
				i++;
			if(i < j)
				arr[j--] = arr[i];
		}
		System.out.println("i: " + i + " j: " + j);
		arr[i] = index;
		sort(arr, low, i-1);
		sort(arr, i+1, hight);
	}

	public static void main(String[] args) {
		int arr[] = {35,9,82,38,74,2,68,7,75,2,687,12,5875,268,26,7,8,63};
		System.out.println(Arrays.toString(arr));
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}


}
