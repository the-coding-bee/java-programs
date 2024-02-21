public class L09_PalindromeNumber {
	public static void main(String[] args) {

		int x = 12321;
		int y = 12345;

		Solution_L09 s = new Solution_L09();
		System.out.println(s.isPalindrome(x));
		System.out.println(s.isPalindrome(y));
	}
}

class Solution_L09 {
	public boolean isPalindrome(int x) {

		if (x < 0)
			return false;

		if (x == reverse(x))
			return true;

		return false;
	}

	public int reverse(int num) {

		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;

	}
}