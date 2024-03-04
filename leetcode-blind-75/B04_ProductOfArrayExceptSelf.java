import java.util.Arrays;

public class B04_ProductOfArrayExceptSelf {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		Solution_B04 s = new Solution_B04();
		System.out.println(Arrays.toString(s.productExceptSelf_1(nums)));
		System.out.println(Arrays.toString(s.productExceptSelf_2(nums)));

	}
}

class Solution_B04 {

	public int[] productExceptSelf_1(int[] nums) {

		int n = nums.length;
		int prefixPdt[] = new int[n];
		int suffixPdt[] = new int[n];
		int outputPdt[] = new int[n];

		prefixPdt[0] = 1;
		for (int i = 1; i < n; i++) {
			prefixPdt[i] = prefixPdt[i - 1] * nums[i - 1];
		}

		suffixPdt[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			suffixPdt[i] = suffixPdt[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < n; i++) {
			outputPdt[i] = prefixPdt[i] * suffixPdt[i];
		}
		return outputPdt;
	}

	public int[] productExceptSelf_2(int[] nums) {

		int n = nums.length;
		int prefixPdt[] = new int[n];
		int outputPdt[] = new int[n];

		prefixPdt[0] = 1;
		for (int i = 1; i < n; i++) {
			prefixPdt[i] = prefixPdt[i - 1] * nums[i - 1];
		}

		int suffixPdt = 1;
		for (int i = n - 1; i >= 0; i--) {
			outputPdt[i] = prefixPdt[i] * suffixPdt;
			suffixPdt = suffixPdt * nums[i];
		}

		return outputPdt;
	}
}