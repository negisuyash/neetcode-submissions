class Solution {
    Integer[] memo;
    public int rob(int[] nums) {
        if(nums.length == 0)    return 0;
        if(nums.length == 1)    return nums[0];
        if(nums.length == 2)    return Math.max(nums[0], nums[1]);
        memo = new Integer[nums.length+1];
        int res1 = dfs(nums,0,nums.length-2);
        memo = new Integer[nums.length+1];
        int res2 = dfs(nums, 1, nums.length-1);
        return Math.max(res1,res2);
    }
    public int dfs(int[] nums, int i, int len){
        if(len < i) return 0;
        if(memo[i]!=null)   return memo[i];
        return memo[i] = Math.max(dfs(nums, i+1, len), nums[i]+dfs(nums, i+2, len));
    }
}
