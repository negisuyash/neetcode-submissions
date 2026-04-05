class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        let result = new Array(nums.length).fill(1);
        let left = 1, right = 1;
        for(let i=0;i<nums.length;i++){
            if(i>0) left *=nums[i-1];
            result[i] = left;
        }
        for(let i=nums.length-1;i>=0;i--){
            if(i<nums.length-1) right *=nums[i+1];
            result[i] *= right;
        }
        return result;
    }
}
