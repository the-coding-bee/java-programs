import java.util.Arrays;
import java.util.Stack;

public class A03_ReverseAnArray {

	public static void main(String[] args) {

		int[] arr1 = { 2, 500, 1, 6, 100, -675, 5 };
		Solution_A03 s = new Solution_A03();

		System.out.println(Arrays.toString(s.reverse(arr1)));
		System.out.println(Arrays.toString(s.reverse_twoPointers(arr1)));

		// Using different variable as the s.reverse_twoPointers method has already
		// reversed the array in place
		int[] arr2 = { 2, 500, 1, 6, 100, -675, 5 };
		System.out.println(Arrays.toString(s.reverse_stack(arr2)));
	}
}

class Solution_A03 {

	// T->O(N), S->O(N)
	public int[] reverse(int[] a) {

		int n = a.length;
		int revArray[] = new int[n];

		for (int i = 0; i < n; i++)
			revArray[i] = a[n - 1 - i];

		return revArray;
	}

	// No Extra Space used So S-->O(N), T-->O(N/2) which is O(N){left<right, only half of array iscompared in loop}
	public int[] reverse_twoPointers(int[] a) {

		int left = 0;
		int right = a.length - 1;

		for (left = 0; left < right; left++, right--) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
		}

		return a;
	}

	// S->O(N) as we using memory for stack. T-->O(N)
	public int[] reverse_stack(int[] a) {

		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < a.length; i++)
			st.push(a[i]);

		for (int i = 0; i < a.length; i++)
			a[i] = st.pop();

		return a;
	}
}
