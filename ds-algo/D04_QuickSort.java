
public class D04_QuickSort {

	public static void main(String[] args) {
		int nums[] = { 1, 32, 7, 4, 9, 3, 0 };
		D04_QuickSort s = new D04_QuickSort();
		int n = nums.length;
		s.sort(nums, 0, n - 1);
		printArray(nums);
	}

	private void sort(int[] a, int l, int h) {

		if (l < h) {
			int p = partition(a, l, h);
			sort(a, l, p);
			sort(a, p + 1, h);
		}
	}

	private int partition(int[] a, int l, int h) {

		int pivot = a[h];
		int i = l;
		int j = h;

		while (i < j) {

			while (i < j && a[i] <= pivot)
				i++;

			while (a[j] > pivot)
				j--;

			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int swap = a[j];
		a[j] = a[l];
		a[l] = swap;
		return j;
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");

	}
}
