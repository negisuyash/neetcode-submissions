class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count = 0;
                int curr = nums[i];
                while(set.contains(curr++)){
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
