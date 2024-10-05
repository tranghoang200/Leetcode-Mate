class Solution {
    public int maxProfit(int[] prices) {

        // TC: O(N)
        // SC: O(1)

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            if(currentPrice < minPrice) {
                minPrice = currentPrice;
            }

            int profit = currentPrice - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;

    }
}