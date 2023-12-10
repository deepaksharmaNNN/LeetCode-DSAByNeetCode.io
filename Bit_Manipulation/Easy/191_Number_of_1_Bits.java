public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int setBits = 0;
        while(n != 0){
            int rsbm = (n & -n);
            n -= rsbm;
            setBits++;
        }
        return setBits;
    }
}