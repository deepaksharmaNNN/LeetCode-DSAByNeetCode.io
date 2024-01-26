//Memoisation
class Solution {
    int memo(int[] cost , int i, int[] dp){
        if(i == cost.length) return 0;
        if(i > cost.length) return Integer.MAX_VALUE;

        if(dp[i] != -1) return dp[i];

        int ip1 = memo(cost,i+1,dp);
        int ip2 = memo(cost,i+2,dp);

        return dp[i] =  Math.min(ip1,ip2) + cost[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp,-1);
        return Math.min(memo(cost,0,dp),memo(cost,1,dp));
    }
}

//Tabulation
class Solution {
    public int tabulation(int[] cost , int[] dp){

        for(int i = cost.length - 1;i>=0;i--){
            int ip1 = (i + 1 == cost.length) ? 0 : dp[i+1];
            int ip2;
            if(i + 2 == cost.length) ip2 = 0;
            else if(i + 2 > cost.length) ip2 = Integer.MAX_VALUE;
            else ip2 = dp[i+2];

            dp[i] = Math.min(ip1,ip2) + cost[i];
        }
        return Math.min(dp[0],dp[1]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        //Arrays.fill(dp,-1);
        return Math.min(tabulation(cost,dp),tabulation(cost,dp));
    }
}

//Optimization
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
    int[] dp = new int[n];
    
    dp[0] = cost[0];
    dp[1] = cost[1];
    
    for (int i = 2; i < n; i++) {
        dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }
    
    return Math.min(dp[n - 1], dp[n - 2]);
    }
}