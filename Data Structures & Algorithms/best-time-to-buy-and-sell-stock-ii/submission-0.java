class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[0], profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>max)   profit += (prices[i]-max);
            max = prices[i];
        }
        return profit;
    }
}