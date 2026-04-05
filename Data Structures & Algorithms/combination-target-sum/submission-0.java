class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(curr, nums, target, 0);
        return res;
    }

    public void backtrack(List<Integer> curr, int[] nums, int target, int idx){
        if(target == 0){
            res.add(new ArrayList(curr));
            return;
        }
        if(target<0 || idx >= nums.length)  return;

        curr.add(nums[idx]);
        backtrack(curr, nums, target-nums[idx], idx);
        curr.remove(curr.size()-1);
        backtrack(curr, nums, target, idx+1);
    }
}
