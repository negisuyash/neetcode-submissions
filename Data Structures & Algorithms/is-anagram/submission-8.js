class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length)    return false;
        if(s.length == 0)   return true;
        let map = new Map();
        for(let i=0;i<s.length;i++){
            map.set(s[i], (map.get(s[i]) || 0) + 1);
            map.set(t[i], (map.get(t[i]) || 0) - 1);
        }
        console.log(map)
        for(let i of map.values()){
            if(i != 0)  return false;
        }
        return true;
    }
}
