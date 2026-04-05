class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(isOpen(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                else if(st.peek() == '(' && s.charAt(i) == ')')  st.pop();
                else if(st.peek() == '[' && s.charAt(i) == ']')  st.pop();
                else if(st.peek() == '{' && s.charAt(i) == '}')  st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }

    public boolean isOpen(char s){
        if(s == '[' || s == '(' || s == '{')    return true;
        return false;
    }
}
