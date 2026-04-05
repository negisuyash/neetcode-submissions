class Solution {
    public int maxArea(int[] h) {
        int max = 0, left = 0, right = h.length-1;
        if(h.length <= 1)   return max;
        while(left < right){
            int water = Math.min(h[left], h[right]) * (right - left);
            max = Math.max(max, water);
            if(h[left] >= h[right]) right--;
            else left++;
        }
        return max;
    }
}
