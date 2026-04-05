class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        if(heights.length <= 1) return 0;
        let max = 0;
        let left = 0, right =heights.length-1;
        while(left<right){
            let water = Math.min(heights[left],heights[right]) * (right-left);
            max = Math.max(max, water);
            if(heights[left]<heights[right])    left++;
            else right--;
        }
        return max;
    }
}
