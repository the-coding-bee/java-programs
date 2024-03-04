public class B05_MaximumSubArraySum {
	public static void main(String[] args) {

		int[] nums = { 1, -2, 3, 4,-4 };

		Solution_B05 s = new Solution_B05();
		System.out.println(s.maxSubArray(nums));
		System.out.println(s.maxSubArray_DP(nums));

	}
}

class Solution_B05 {
	public int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int runningSum = 0;
			for (int j = i; j < nums.length; j++) {
				runningSum = runningSum + nums[j];
				if (runningSum > maxSum)
					maxSum = runningSum;
			}
		}
		return maxSum;
	}
	
	 public int maxSubArray_DP(int[] nums) {
	     int currMaxSum = nums[0];
	     int maxSum = nums[0];
	     for (int i = 1; i < nums.length; i++) {
	       currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
	       maxSum = Math.max(maxSum, currMaxSum);
	     }
	     return maxSum;
	  }

}