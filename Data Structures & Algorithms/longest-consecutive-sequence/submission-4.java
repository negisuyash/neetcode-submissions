class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i:nums) set.add(i);
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int curr = 0, temp = nums[i];
                while(set.contains(temp++)) curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
