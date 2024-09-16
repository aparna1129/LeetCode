class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maximumProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - mini;
            maximumProfit = Math.max(maximumProfit, profit);
            mini = Math.min(mini, prices[i]);
        }
        return maximumProfit;
    }
}