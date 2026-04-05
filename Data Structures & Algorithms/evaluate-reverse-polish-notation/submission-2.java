class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s:tokens){
            if(isOp(s)){
                int res = doOp(st.pop(), st.pop(), s);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }

    public boolean isOp(String s){
        if(s.equals("+") || s.equals("/") || s.equals("*") || s.equals("-"))    return true;
        return false;
    }

    public int doOp(int b, int a, String s){
        if(s.equals("+"))   return a+b;
        if(s.equals("-"))   return a-b;
        if(s.equals("*"))   return a*b;
        return a/b;
    }
}
