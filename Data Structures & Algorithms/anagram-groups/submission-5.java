class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String i : strs){
            int[] arrkey =  new int[26];
            int idx = 0;
            while(idx < i.length()){
                arrkey[i.charAt(idx)-'a']++;
                idx++;
            }
            String finalKey = Arrays.toString(arrkey);
            List<String> list = map.getOrDefault(finalKey, new ArrayList<String>());
            list.add(i);
            map.put(finalKey, list);
        }
        return new ArrayList<>(map.values());
    }
}
