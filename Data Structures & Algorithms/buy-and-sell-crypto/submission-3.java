class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, curr = 0, buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy)   buy = prices[i];
            else{
                curr = Math.max(curr, prices[i] - buy);
                max = Math.max(curr, max);
            }
        }
        return max;
    }
}
