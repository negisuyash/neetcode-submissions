class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String i:tokens){
            if(isOp(i)){
                s.push(doOp(i, s.pop(), s.pop()));
            }
            else    s.push(Integer.parseInt(i));
        }
        return s.pop();
    }

    public int doOp(String op, int b, int a){
        if(op.equals("*"))   return a * b;
        else if(op.equals("-"))  return a - b;
        else if(op.equals("/"))  return b==0 ? 0 : a / b;
        else return a + b;
    }

    public boolean isOp(String op){
        return op.equals("*") || op.equals("/") || op.equals("-") || op.equals("+");
    }
}
