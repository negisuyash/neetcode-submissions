class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, res = 0;
        for(int right = 0; right<s.length(); right++){
            map.put(s.charAt(right), 1 + map.getOrDefault(s.charAt(right),0));

            while(((right-left+1)-maxVal(map)) > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public int maxVal(Map<Character, Integer> map){
        int max = 0;
        for(char i:map.keySet()){
            max = Math.max(max, map.get(i));
        }
        return max;
    }
}
