class Solution {
    public boolean isPalindrome(String str) {
        if(str.length() <= 1) return true;
        int left = 0, right = str.length() - 1;
        while(left < right){
            if(!Character.isLetterOrDigit(str.charAt(left)))    left++;
            else if(!Character.isLetterOrDigit(str.charAt(right)))  right--;
            else if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))  return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
