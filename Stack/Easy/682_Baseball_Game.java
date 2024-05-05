class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2);
                st.push(val1);
                st.push(val1 + val2);
            }else if(operations[i].equals("D")){
                int val = 2 * st.peek();
                st.push(val);
            }else if(operations[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int n = st.size();
        int total = 0;
        for(int i = 0; i < n; i++){
            total += st.pop();
        }
        return total;
    }
}