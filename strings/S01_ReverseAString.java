import java.util.Stack;

public class S01_ReverseAString {

	public static void main(String[] args) {

		String str = "TheCodingBee";
		Solution_S01 s = new Solution_S01();

		// Operate on String
		System.out.println(s.reverse_recursion(str));
		System.out.println(s.reverse_charAt(str));

		// Operate on StringBuffer and StringBuilder
		System.out.println(s.reverse_stringbuffer(str));
		System.out.println(s.reverse_stringbuilder(str));

		// Convert to CharArray and then Operate
		System.out.println(s.reverse_charArray(str));
		System.out.println(s.reverse_charArray_twoPointers(str));
		System.out.println(s.reverse_charArray_stack(str));
	}

}

class Solution_S01 {

	// Using Recursion
	public String reverse_recursion(String str) {

		if (str.length() <= 1)
			return str;
		else
			return reverse_recursion(str.substring(1)) + str.charAt(0);
	}

	public String reverse_stringbuffer(String str) {

		StringBuffer buffer = new StringBuffer(str);
		return buffer.reverse().toString();
	}

	public String reverse_stringbuilder(String str) {

		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}

	public String reverse_charAt(String str) {

		String revStr = "";
		int n = str.length();

		for (int i = 0; i < n; i++)
			revStr = revStr + str.charAt(n - 1 - i);

		return revStr;
	}

	/************************* CHAR ARRAY *************************/

	public String reverse_charArray(String str) {

		String revStr = "";
		int n = str.length();
		char[] charArry = str.toCharArray();

		for (int i = 0; i < n; i++)
			revStr = revStr + charArry[n - 1 - i];

		return revStr;
	}

	//S->O(1), T-->O(N) 
	public String reverse_charArray_twoPointers(String str) {

		char[] charArry = str.toCharArray();
		String revStr = "";

		int left = 0;
		int right = charArry.length - 1;

		for (left = 0; left < right; left++, right--) {
			char temp = charArry[left];
			charArry[left] = charArry[right];
			charArry[right] = temp;
		}

		// Can't do charArry.toString()as it would return [C@77afea7d
		for (char ch : charArry)
			revStr = revStr + ch;//

		return revStr;
	}

	// In place reversal, but S->O(N) as we using memory for stack. T-->O(N)
	public String reverse_charArray_stack(String str) {

		char[] charArry = str.toCharArray();
		String revStr = "";

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < charArry.length; i++)
			st.push(charArry[i]);

		for (int i = 0; i < charArry.length; i++)
			charArry[i] = st.pop();

		for (char ch : charArry)
			revStr = revStr + ch;//

		return revStr;
	}
}
