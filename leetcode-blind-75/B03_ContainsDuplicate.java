import java.util.Arrays;
import java.util.HashSet;

public class B03_ContainsDuplicate {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };

		Solution_B03 s = new Solution_B03();
		System.out.println(s.containsDuplicate_naive(nums));
		System.out.println(s.containsDuplicate_sorting(nums));
		System.out.println(s.containsDuplicate_hashing(nums));
	}
}

class Solution_B03 {

	// T-> O(N) ,HashSet look up takes only O(1) time
	// S-> O(N), HashSet takes space
	public boolean containsDuplicate_hashing(int[] nums) {

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (hs.contains(nums[i]))
				return true;
			else
				hs.add(nums[i]);
		}
		return false;
	}

	// T -> O(N*logN)
	public boolean containsDuplicate_sorting(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}

	// T -> O(N*N)
	public boolean containsDuplicate_naive(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j])
					return true;
			}
		}
		return false;
	}
}