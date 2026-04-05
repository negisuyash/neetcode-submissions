class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i:nums) set.add(i);
        int i = 0;
        while(i<nums.length){
            if(!set.contains(nums[i]-1)){
                int curr = nums[i];
                int res = 0;
                while(set.contains(curr++))  res++;
                max = Math.max(res, max);
            }
            i++;
        }
        return max;
    }
}
