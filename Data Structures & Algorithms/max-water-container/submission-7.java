class Solution {
    public int maxArea(int[] h) {
        int left = 0, right = h.length-1, max = 0;
        while(left<right){
            max = Math.max(Math.min(h[left], h[right])*(right-left), max);
            if(h[left]<h[right])    left++;
            else right--;
        }
        return max;
    }
}
