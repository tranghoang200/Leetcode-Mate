var maxProfit = function(prices) {

    // TC: O(N)
    // SC: O(1)

    let minPrice = Infinity;
    let maxProfit = 0;

    for (let i = 0; i < prices.length; i++) {
        let currentPrice = prices[i];

        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }

        let profit = currentPrice - minPrice;

        if (profit > maxProfit) {
            maxProfit = profit;
        }
    }

    return maxProfit;
};
