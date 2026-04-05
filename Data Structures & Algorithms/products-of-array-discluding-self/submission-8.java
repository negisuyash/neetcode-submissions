class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int pro = 1;
        for(int i=0;i<nums.length;i++){
            if(i>0) pro *= nums[i-1];
            res[i] = pro;
        }
        pro = 1;
        for(int i=nums.length-1;i>=0;i--){
            if(i<nums.length-1) pro *= nums[i+1];
            res[i] *= pro;
        }
        return res;
    }
}  
