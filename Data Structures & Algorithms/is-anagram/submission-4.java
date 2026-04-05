class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        if(s.length()==0)   return true;
        Map<Character, Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            map.put(i, map.getOrDefault(i,0)-1);
        }
        for(char i:map.keySet()){
            if(map.get(i)!=0)   return false;
        }
        return true;
    }
}
