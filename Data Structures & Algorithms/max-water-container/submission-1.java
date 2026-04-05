class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int max = 0;
        if(heights.length<2)    return 0;
        while(left < right){
            int currMax = Math.min(heights[left],heights[right]) * (right-left);
            max = Math.max(max, currMax);
            if(heights[left] >= heights[right]) right--;
            else    left++;
        }
        return max;
    }
}
