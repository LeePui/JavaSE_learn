package sort;

import java.util.Arrays;

/**
 * 快排
 * @author 李拜天
 *
 */
public class QuickSort {

	public static void sort(int[] arr, int low, int hight) {
		int i, j, index;
		if(low > hight) {
			return;
		}
		
		i = low; j = hight; index = arr[i];
		while(i < j) {
			while(i < j && arr[j] > index)
				j--;
			if(i < j)
				arr[i++] = arr[j];	//记住这里是先执行了arr[i] = arr[j],然后再执行i++的
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
	
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	
	public static void main(String[] args) {
		int arr[] = {49,38,65,97,76,13,27,49};
		System.out.println(Arrays.toString(arr));
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
