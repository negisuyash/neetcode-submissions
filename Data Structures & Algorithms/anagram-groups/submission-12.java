class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> group = new HashMap<>();
        for(String s:strs){
            int[] map = new int[26];
            for(int i=0;i<s.length();i++){
                map[s.charAt(i)-'a']++;
            }
            String mapKey = Arrays.toString(map);
            List<String> list = group.getOrDefault(mapKey, new ArrayList<>());
            list.add(s);
            group.put(mapKey, list);
        }
        for(String i:group.keySet()){
            res.add(group.get(i));
        }
        return res;
    }
}
