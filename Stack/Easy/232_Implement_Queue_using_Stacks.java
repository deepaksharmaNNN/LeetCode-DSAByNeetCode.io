class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        while(in.size() > 0){
            out.push(in.pop());
        }
        in.push(x);
        while(out.size() > 0){
            in.push(out.pop());
        }
    }
    
    public int pop() {
        if(in.isEmpty()) return -1;
        return in.pop();
    }
    
    public int peek() {
        return in.peek();
    }
    
    public boolean empty() {
        return in.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */