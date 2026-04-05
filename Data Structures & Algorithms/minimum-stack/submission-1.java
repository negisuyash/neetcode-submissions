class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty())  minStack.push(val);
        else minStack.push(Math.min(minStack.peek(), val));
    }
    
    public void pop() {
        if(!stack.isEmpty()) stack.pop();
        if(!minStack.isEmpty()) minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
