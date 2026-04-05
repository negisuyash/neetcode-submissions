class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] key = new int[26];
            for(int i=0;i<s.length();i++){
                key[s.charAt(i)-'a']++;
            }
            String finalKey = Arrays.toString(key);
            List<String> list = map.getOrDefault(finalKey, new ArrayList<>());
            list.add(s);
            map.put(finalKey, list);
        }
        return new ArrayList<>(map.values());
    }
}
