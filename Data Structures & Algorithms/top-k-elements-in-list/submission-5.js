class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let map = new Map();
        // let result = [];
        for(let i of nums){
            map.set(i, (map.get(i) || 0)+1);
        }
        let res = Array.from(map.entries()).sort((a,b) => b[1]-a[1]);
        return res.splice(0,k).map(a => a[0]);
        // console.log(res);
        // let idx = 0;
        // while(k-->0){
        //     result.push(res[idx++][0]);
        // }
        // return result;
    }
}
