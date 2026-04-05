class Solution {
    public int maxArea(int[] heights) {
        int max = 0, i = 0, j = heights.length-1;
        while(i<j){
            int temp_max = Math.min(heights[i], heights[j]) * (j-i);
            max = Math.max(temp_max, max);
            if(heights[i]>= heights[j]) j--;
            else i++;
        }
        return max;
    }
}
