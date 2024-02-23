public class B02_BestTimeToBuyStocks {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		Solution_B02 s = new Solution_B02();
		System.out.println(s.maxProfit(prices));
		System.out.println(s.maxProfit_bruteForce(prices));
	}

}

class Solution_B02 {

	// O(N)
	public int maxProfit(int[] prices) {

		int max_profit = 0;
		int buy = prices[0];

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] < buy)
				buy = prices[i];

			else if (prices[i] - buy > max_profit)
				max_profit = prices[i] - buy;

		}
		return max_profit;
	}

	// O(N*N)
	public int maxProfit_bruteForce(int[] prices) {

		int max_profit = 0;

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {

				if (prices[j] - prices[i] > max_profit)
					max_profit = prices[j] - prices[i];
			}
		}
		return max_profit;
	}
}