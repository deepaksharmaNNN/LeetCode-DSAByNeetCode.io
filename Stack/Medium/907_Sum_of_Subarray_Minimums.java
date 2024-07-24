class Solution {
    private int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    private int[] previousSmallerEqualElement(int[] arr) {
        int n = arr.length;
        int[] psee = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = nextSmallerElement(arr);
        int[] psee = previousSmallerEqualElement(arr);
        long total = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            total = (total + (long) arr[i] * left * right) % mod;
        }
        return (int) total;
    }
}