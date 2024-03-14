package sorting;
import java.util.Arrays;

public class D03_InsertionSort {

	public static void main(String[] args) {
		int nums[] = { 1, 32, 7, 4, 9, 3, 0 };
		D03_InsertionSort s = new D03_InsertionSort();
		System.out.println(Arrays.toString(s.sort(nums)));
	}

	private int[] sort(int[] a) {

		int n = a.length;

		for (int i = 1; i < n; i++) {

			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {

				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		return a;
	}
}
