class Solution {
    public int trap(int[] h) {
        final int len = h.length;
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = h[0];
        for(int i=1;i<len;i++){
            left[i] = Math.max(left[i-1], h[i]);
        }

        right[len-1] = h[len-1];
        for(int i=len-2;i>=0;i--){
            right[i] = Math.max(right[i+1], h[i]);
        }

        int res = 0;

        for(int i=0;i<len;i++){
            res += (Math.min(left[i],right[i]) - h[i]);
        }

        return res;
    }
}
