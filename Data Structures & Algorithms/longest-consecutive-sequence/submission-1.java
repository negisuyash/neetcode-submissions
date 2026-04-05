class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        if(nums.length == 0)    return res;
        if(nums.length == 1)    return 1;

        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        for(int i:nums){
            if(!set.contains(i-1)){
                int currMax = 0;
                int val = i;
                while(set.contains(val++)){
                    res = Math.max(++currMax, res);
                }
            }
        }
        return res;
    }
}
