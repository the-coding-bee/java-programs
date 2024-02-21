import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L1_TwoSum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 4 };
		int target = 6;

		Solution_L1 s = new Solution_L1();
		System.out.println(Arrays.toString(s.twoSum(nums, target)));
		System.out.println(Arrays.toString(s.twoSum_bruteForce(nums, target)));
	}

}

class Solution_L1 {

	// O(N*logN)
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> nums_map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			if (nums_map.containsKey(compliment)) {
				return new int[] { nums_map.get(compliment), i };
			}
			nums_map.put(nums[i], i);
		}
		throw new IllegalArgumentException("Match Not Found");
	}

	// O(N*N)
	public int[] twoSum_bruteForce(int[] nums, int target) {

		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}
		return output;

	}
}