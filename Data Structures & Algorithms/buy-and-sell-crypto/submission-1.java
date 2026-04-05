class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, buy = prices[0];
        for(int i:prices){
            if(buy > i){
                buy = i;
            }
            else{
                max = Math.max(max, i - buy);
            }
        }
        return max;
    }
}
