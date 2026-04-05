class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length() != t.length())    return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int val = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i), ++val);
        }
        for(int i=0;i<t.length();i++){
            int val = map.getOrDefault(t.charAt(i),0);
            map.put(t.charAt(i), --val);
        }
        for(char key:map.keySet()){
            if(map.get(key) != 0)   return false;
        }
        return true;
    }
}
