package sort;

import java.util.Arrays;

/**
 * 自己写快排
 * 升序排序
 * @author 李拜天
 *	思路：找一个轴值，保存起来，前后指针，先从右边开始判断，判断到小于的交换去左边，然后从左边开始判断，大于的交换去右边。然后进行递归
 */

public class QuickSort2 {

	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	public static void sort(int[] arr, int low, int hight) {
		int i, j, index;
		if(low > hight)
			return;
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
