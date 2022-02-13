package easy;

    /*
    Name: Best Time to Buy and Sell Stock
    Difficulty: Easy
    Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     */

public class Problem_121 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1, j = 0; i < prices.length; i++) {
            int currentProfit = prices[i] - prices[j];
            if (currentProfit < 0) {
                j = i;
                currentProfit = 0;
            }
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
