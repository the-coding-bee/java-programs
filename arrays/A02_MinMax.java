public class A02_MinMax {

	public static void main(String[] args) {
		int[] numbers = { 1, 6, 100, -675, 5 };

		Solution_A02 s = new Solution_A02();
		System.out.println("Minimum Number is " + s.getMin(numbers));
		System.out.println("Maximum Number is " + s.getMax(numbers));
	}
}

class Solution_A02 {

	public int getMin(int a[]) {

		int min = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] < min)
				min=a[i];
		return min;
	}

	public int getMax(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] > max)
				max=a[i];
		return max;
	}

}
