class Solution {
    public int maxArea(int[] h) {
        int max = 0, left = 0, right = h.length-1;
        while(left < right){
            int area = Math.min(h[left], h[right]) * (right-left);
            max = Math.max(area, max);
            if(h[left] < h[right])  left++;
            else right--;
        }
        return max;
    }
}
