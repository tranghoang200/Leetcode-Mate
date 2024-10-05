class Solution {
public:

    // TC: O(N)
    // SC: O(1)

    int maxProfit(vector<int>& prices) {
        int minPrice = INT_MAX;
        int maxProfit = 0;

        for (int i = 0; i < prices.size(); i++) {
            int currentPrice = prices[i];

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }

            int profit = currentPrice - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
};
