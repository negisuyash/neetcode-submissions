class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] key = new int[26];
            for(int i=0;i<str.length();i++){
                key[str.charAt(i)-'a']++;
            }
            String keyStr = Arrays.toString(key);
            List<String> list = map.getOrDefault(keyStr, new ArrayList<>());
            list.add(str);
            map.put(keyStr, list);
        }
        return new ArrayList<>(map.values());
    }
}
