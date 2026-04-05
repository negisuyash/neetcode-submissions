class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toLowerCase().replaceAll("[^a-z0-9]","");
        // System.out.println(s);
        int len = s.length();
        for(int i=0,j=len-1;(i<len/2+1) && j>=0;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))    return false;
        }
        return true;
    }
}
