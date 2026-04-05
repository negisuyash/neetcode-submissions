class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char i:s.toCharArray()){
            if(st.size()==0 || isOpen(i))   st.push(i);
            else if(st.peek() == '{' && i == '}')   st.pop();
            else if(st.peek() == '(' && i == ')')   st.pop();
            else if(st.peek() == '[' && i == ']')   st.pop();
            else st.push(i);
        }
        return st.size() == 0;
    }

    public boolean isOpen(char i){
        if(i == '{' || i == '(' || i == '[')    return true;
        return false;
    }
}
