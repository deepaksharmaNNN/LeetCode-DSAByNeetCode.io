class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int num : asteroids){
            while(!st.isEmpty() && num < 0 && st.peek() > 0){
                int sum = num + st.peek();
                if(sum < 0){
                    st.pop();
                }else if(sum > 0){
                    num = 0;
                }else{
                    st.pop();
                    num = 0;
                }
            }
            if(num != 0) st.push(num);
        }
        int n = st.size();
        int[] arr = new int[n];
        for(int i = n - 1; i >= 0; i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}