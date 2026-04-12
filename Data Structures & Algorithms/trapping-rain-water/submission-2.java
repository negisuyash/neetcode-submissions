class Solution {
    public int trap(int[] h) {
        int res = 0;
        if(h.length<=1) return res;

        int[] leftMax = new int[h.length];
        int[] rightMax = new int[h.length];

        leftMax[0] = h[0];

        for(int i=1;i<h.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], h[i]);
        }

        rightMax[h.length-1] = h[h.length-1];

        for(int i=h.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], h[i]);
        }

        for(int i=0;i<h.length;i++){
            res += Math.min(leftMax[i], rightMax[i]) - h[i];
        }

        return res;
    }
}
