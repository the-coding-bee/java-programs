public class B07_FindMinRotatedArray {
	public static void main(String[] args) {

		int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
		int[] nums2 = { 3, 4, 5, 1, 2 };

		Solution_B07 s = new Solution_B07();
		System.out.println(s.findMin(nums1));
		System.out.println(s.findMin(nums2));

	}
}

class Solution_B07 {
	public int findMin(int[] a) {

		int l = 0;
		int h = a.length - 1;
		int mid;

		while (l <= h) {
			mid = (l + h) / 2;

			if (mid > 0 && a[mid] < a[mid - 1])
				return a[mid];

			if (a[mid] > a[h])
				l = mid + 1;
			else
				h = mid - 1;

		}
		return a[l];
	}
}