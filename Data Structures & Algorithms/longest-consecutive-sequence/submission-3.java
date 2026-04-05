class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            int temp = 0;
            int num = nums[i];
            if(!set.contains(num-1)){
                temp++;
                while(set.contains(++num))  temp++;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
