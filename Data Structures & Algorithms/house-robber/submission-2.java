class Solution {
    Integer[] memo;
    public int rob(int[] nums) {
        this.memo = new Integer[nums.length+1];
        return dfs(nums, 0);
    }

    public int dfs(int[] nums, int i){
        if(i >= nums.length)    return 0;
        if(memo[i] != null) return memo[i];
        return memo[i] = Math.max(dfs(nums, i+1), nums[i]+dfs(nums,i+2));
    }
}
