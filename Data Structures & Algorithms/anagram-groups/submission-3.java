class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] key = new int[26];
            for(int i=0;i<s.length();i++){
                key[s.charAt(i)-'a']++;
            }
            List<String> list = map.getOrDefault(Arrays.toString(key), new ArrayList<>());
            list.add(s);
            map.put(Arrays.toString(key), list);
        }
        return new ArrayList<>(map.values());
    }
}
