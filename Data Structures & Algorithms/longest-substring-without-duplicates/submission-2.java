class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0, left = 0;
        for(int right=0; right<s.length();right++)
        {
            char currentChar = s.charAt(right);
            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
