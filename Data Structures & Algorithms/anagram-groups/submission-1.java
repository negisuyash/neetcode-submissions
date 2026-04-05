class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] key = new int[26];
            for(int i=0;i<s.length();i++){
                key[s.charAt(i)-'a']++;
            }
            List<String> group = map.getOrDefault(Arrays.toString(key), new ArrayList<>());
            group.add(s);
            map.put(Arrays.toString(key), group);
        }
        for(String i:map.keySet()){
            res.add(map.get(i));
        }
        return res;
    }
}
