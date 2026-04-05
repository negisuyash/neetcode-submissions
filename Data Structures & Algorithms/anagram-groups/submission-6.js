class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let result = [];
        let map = new Map();
        for(let s of strs){
            let key = s.split('').sort().join('');
            let res = map.get(key) || [];
            res.push(s);
            map.set(key, res);
        }
        for(let i of map.values()){
            result.push(i);
        }
        return result;
    }
}
