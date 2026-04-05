class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] res = new char[word1.length()+word2.length()];
        int idx = 0, res_idx = 0;
        while(idx<word1.length() && idx<word2.length()){
            res[res_idx++] = word1.charAt(idx);
            res[res_idx++] = word2.charAt(idx);
            idx++;
        }
        while(idx<word1.length())   res[res_idx++] = word1.charAt(idx++);
        while(idx<word2.length())   res[res_idx++] = word2.charAt(idx++);
        return new String(res); 
    }
}