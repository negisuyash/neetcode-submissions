class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        if(s.length()==0)   return true;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        for(char i:map.keySet()){
            if(map.get(i)!=0)   return false;
        }
        return true;
    }
}
