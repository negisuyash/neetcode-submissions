class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0)    return "";
        if(strs.length == 1)    return strs[0];

        StringBuilder res = new StringBuilder();
        
        for(int i=0;i<strs[0].length();i++){
            char s = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != s)  return res.toString();
                if(j == strs.length - 1)    res.append(s);
            }
        }

        return res.toString();
    }
}