class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left = i+1, right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> temp = Arrays.asList(nums[i], nums[left], nums[right]);
                    if(!res.contains(temp)) res.add(temp);
                    left++;
                    right--;
                }
                else if(sum > 0)    right--;
                else left++;
            }
        }
        return res;
    }
}
