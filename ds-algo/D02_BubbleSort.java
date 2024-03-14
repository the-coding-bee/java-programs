package sorting;

import java.util.Arrays;

public class D02_BubbleSort {

	public static void main(String[] args) {
		int nums[] = { 1, 32, 7, 4, 9, 3, 0 };
		D02_BubbleSort s = new D02_BubbleSort();
		System.out.println(Arrays.toString(s.sort(nums)));
	}

	private int[] sort(int[] a) {

		int n = a.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		return a;
	}
}
