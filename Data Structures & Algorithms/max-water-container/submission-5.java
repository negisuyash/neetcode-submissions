class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        if(h.length < 2)    return max;
        int left = 0, right = h.length-1;
        while(left < right){
            int cap = Math.min(h[left], h[right]) * (right - left);
            max = Math.max(cap, max);
            if(h[left] > h[right])  right--;
            else left++;
        }
        return max;
    }
}
