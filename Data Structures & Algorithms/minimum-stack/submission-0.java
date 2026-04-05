class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty())  minStack.push(val);
        else    minStack.push(minStack.peek() < val ? minStack.peek() : val);
    }
    
    public void pop() {
        if(mainStack.size() > 0){
            mainStack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.isEmpty() ? null : mainStack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty() ? null : minStack.peek();
    }
}
