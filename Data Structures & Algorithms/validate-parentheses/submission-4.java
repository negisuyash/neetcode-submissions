class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c == '{')    dq.push('}');
            else if(c == '[')   dq.push(']');
            else if(c == '(')   dq.push(')');
            else{
                if(dq.isEmpty() || dq.peek() != c)  return false;
                dq.pop();
            }
        }
        return dq.isEmpty();
    }
}
