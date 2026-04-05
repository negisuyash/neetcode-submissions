class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
                int val = i;
                int res = 0;
                while(set.contains(val++)){
                    res++;
                    max = Math.max(res, max);
                }
            }
        }
        return max;
    }
}
