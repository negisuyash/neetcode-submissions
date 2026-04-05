class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)  return 0;
        int currMax = nums[0], maxSoFar = nums[0];
        for(int i=1;i<nums.length;i++){
            currMax = Math.max(nums[i], currMax+nums[i]);
            maxSoFar = Math.max(currMax, maxSoFar);
        }
        return maxSoFar;
    }
}
