class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, buy = prices[0], profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy) buy= prices[i];
            else{
                profit = Math.max(profit, prices[i]-buy);
                max = Math.max(max, profit);
            }
        }
        return max;
    }
}
