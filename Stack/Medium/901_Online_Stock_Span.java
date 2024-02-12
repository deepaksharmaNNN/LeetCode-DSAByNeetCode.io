class StockSpanner {

    Stack<Integer> stack;
    ArrayList<Integer> list;
    public StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        while(stack.size() > 0 && list.get(stack.peek()) <= price){
            stack.pop();
        }
        int prev = (stack.isEmpty() ? -1 : stack.peek());
        int curr = list.size() - 1;
        stack.push(curr);
        return curr - prev;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */