class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // Use the previously computed result for num / 2
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }
}