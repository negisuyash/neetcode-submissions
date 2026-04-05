class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0, left = 0, right = nums.length-1;
        while(left <= right){
            if(nums[left] != val){
                left++;
                res++;
            }
            else if(nums[left] == val && nums[right] != val){
                nums[left] = nums[right];
                nums[right] = val;
                right--;
                left++;
                res++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}