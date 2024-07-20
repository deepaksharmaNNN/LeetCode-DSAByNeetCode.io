class MinStack {
    class Pair{
        int node;
        int min;
        Pair(int node, int min){
            this.node = node;
            this.min = min;
        }
    }
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val, val));
        }else{
            st.push(new Pair(val, Math.min(val, st.peek().min)));
        }
    }
    
    public void pop() {
        if(st.size() > 0) st.pop();
    }
    
    public int top() {
        return st.peek().node;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */