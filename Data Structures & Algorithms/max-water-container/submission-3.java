class Solution {
    public int maxArea(int[] heights) {
        int max = 0, l = 0, r = heights.length-1;
        if(heights.length <= 1) return 0;
        while(l < r){
            int trap = Math.min(heights[l], heights[r]) * (r-l);
            max = Math.max(max, trap);
            if(heights[l] > heights[r]) r--;
            else l++;
        }
        return max;
    }
}
