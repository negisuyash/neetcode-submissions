class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        // 1. MUST provide a comparator for numeric sort
        nums.sort((a, b) => a - b);
        const result = [];

        for (let i = 0; i < nums.length; i++) {
            // 2. Skip duplicate values for the first element
            if (i > 0 && nums[i] === nums[i - 1]) continue;

            let left = i + 1;
            let right = nums.length - 1;

            while (left < right) {
                const sum = nums[i] + nums[left] + nums[right];

                if (sum === 0) {
                    result.push([nums[i], nums[left], nums[right]]);
                    
                    // 3. Skip duplicates for left and right pointers
                    while (left < right && nums[left] === nums[left + 1]) left++;
                    while (left < right && nums[right] === nums[right - 1]) right--;
                    
                    // Move both pointers inward after finding a match
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}