class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let map = new Map();
        for(let num of nums){
            map.set(num, (map.get(num) || 0)+1);
        }
        let entries = Array.from(map.entries());
        entries.sort((a,b) => b[1] - a[1]);
        let result = [];
        for(let i=0;i<k;i++){
            result.push(entries.shift()[0]);
        }
        return result;
    }
}
