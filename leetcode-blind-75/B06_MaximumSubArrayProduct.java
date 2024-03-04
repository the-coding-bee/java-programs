public class B06_MaximumSubArrayProduct {
	public static void main(String[] args) {

		int[] nums = { -2, 3, -4 };

		Solution_B06 s = new Solution_B06();
		System.out.println(s.maxProduct(nums));
		System.out.println(s.maxProduct_naive(nums));

	}
}

class Solution_B06 {

	public int maxProduct_naive(int[] nums) {

		int maxPdt = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int runningPdt = 1;
			for (int j = i; j < nums.length; j++) {
				runningPdt = runningPdt * nums[j];
				if (runningPdt > maxPdt)
					maxPdt = runningPdt;
			}
		}
		return maxPdt;
	}

	public int maxProduct(int[] nums) {

		int currMaxPdt = nums[0];
		int currMinPdt = nums[0];
		int maxPdt = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int temp = max(nums[i], nums[i] * currMaxPdt, nums[i] * currMinPdt);
			currMinPdt = min(nums[i], nums[i] * currMaxPdt, nums[i] * currMinPdt);
			currMaxPdt = temp;
			maxPdt = Math.max(maxPdt, currMaxPdt);
		}

		return maxPdt;
	}

	public int max(int a, int b, int c) {
		return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	}

	public int min(int a, int b, int c) {
		return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
	}

}