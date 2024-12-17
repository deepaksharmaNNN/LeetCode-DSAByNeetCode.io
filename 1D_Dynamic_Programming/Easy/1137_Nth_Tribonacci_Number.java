class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int a = 0, b = 1, c = 1;
        int d = 0;
        for(int i = 3; i <= n; i++){
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
/*
class Solution {
    private int solve(int n, int[] dp){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(dp[n] != -1) return dp[n];
        int a = solve(n - 1, dp);
        int b = solve(n - 2, dp);
        int c = solve(n - 3, dp);
        return dp[n] = a + b + c;
    }
    public int tribonacci(int n) {
        int[] dp = new int[38];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
}
*/
/*
class Solution {
    public int tribonacci(int n) {
        int t1 = 0, t2 = 1, t3 = 1;
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int currN = 0;
        for(int i = 3; i <= n; i++){
            currN = t1 + t2  + t3;
            if(i == n) return currN;
            t1 = t2;
            t2 = t3;
            t3 = currN;
        }
        return currN;
    }
}
 */