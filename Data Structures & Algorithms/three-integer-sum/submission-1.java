class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int idx=0;idx<nums.length;idx++){
            int i = idx + 1;
            int j = nums.length-1;
            while(i<j){
                if(nums[idx]+nums[i]+nums[j] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[idx]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    if(!res.contains(temp)) res.add(temp);
                    i++; j--;
                }
                else if(nums[idx]+nums[i]+nums[j] > 0){
                    j--;
                }
                else    i++;
            }
        }
        return res;
    }
}
