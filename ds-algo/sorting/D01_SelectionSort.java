package sorting;

import java.util.Arrays;

public class D01_SelectionSort {

	public static void main(String[] args) {
		int nums[] = { 1, 32, 7, 4, 9, 3, 0 };
		D01_SelectionSort s = new D01_SelectionSort();
		System.out.println(Arrays.toString(s.sort(nums)));
	}

	private int[] sort(int[] a) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_idx])
					min_idx = j;
			}

			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}

		return a;
	}
}
