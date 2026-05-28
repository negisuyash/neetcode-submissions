class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] keyArr = new int[26];
            for(int i=0;i<s.length();i++){
                keyArr[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(keyArr);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
