class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] key = new int[26];
            for(char c:s.toCharArray()){
                ++key[c-'a'];
            }
            List<String> list = map.getOrDefault(Arrays.toString(key), new ArrayList<>());
            list.add(s);
            map.put(Arrays.toString(key), list);
        }
        for(String key:map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}
