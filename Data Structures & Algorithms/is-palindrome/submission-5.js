class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
s = s.toLowerCase().split('').filter(char => {
    const code = char.charCodeAt(0);
    return (code >= 97 && code <= 122) || (code >= 48 && code <= 57);
}).join('');
        let left = 0, right = s.length-1;
        while(left<right){
            if(s[left]!=s[right])   return false;
            left++;
            right--;
        }
        return true;
    }
}
