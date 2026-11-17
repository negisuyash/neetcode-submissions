class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        var map = new Map();
        for(let i in nums){
            if(map.has(target-nums[i])){
                return [Number(i), Number(map.get(target-nums[i]))];
            }
            map.set(nums[i],i);
        }
        return [];
    }
}
