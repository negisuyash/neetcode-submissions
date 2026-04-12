class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int curr = nums[i];
                int count = 0;
                while(set.contains(curr++)){
                    count++;
                }
                max = Math.max(count, max);
            }
        }

        return max;
    }
}
