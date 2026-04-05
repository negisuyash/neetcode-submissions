class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        for(int right = 0; right<s.length();right++){
            char currChar = s.charAt(right);
            while(set.contains(currChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currChar);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}