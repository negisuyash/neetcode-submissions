class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(isOpen(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ')'){
                    if(!st.isEmpty() && st.peek()=='(') st.pop();
                    else st.push(s.charAt(i));
                }
                else if(s.charAt(i) == ']'){
                    if(!st.isEmpty() && st.peek()=='[') st.pop();
                    else st.push(s.charAt(i));
                }
                else if(s.charAt(i) == '}'){
                    if(!st.isEmpty() && st.peek()=='{') st.pop();
                    else st.push(s.charAt(i));
                }  
            }
        }
        return st.size() == 0;
    }

    public boolean isOpen(char c){
        if(c == '(' || c == '[' || c == '{')    return true;
        return false;
    }
}
