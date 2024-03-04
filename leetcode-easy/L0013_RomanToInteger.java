import java.util.HashMap;
import java.util.Map;

public class L0013_RomanToInteger {

	public static void main(String[] args) {

		String s1 = "LVIII";
		String s2 = "MCMXCIV";

		Solution_L0013 s = new Solution_L0013();
		System.out.println(s.romanToInt(s1));
		System.out.println(s.romanToInt(s2));
	}
}

class Solution_L0013 {
	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;

		for (int i = 0; i < s.length(); i++) {

			if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1)))
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
			else
				result += map.get(s.charAt(i));

		}
		return result;
	}
}
