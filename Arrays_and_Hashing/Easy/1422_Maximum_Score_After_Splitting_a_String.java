class Solution {
    // TC -> O(N) Single pass
    public int maxScore(String s) {
        int total = -502;
        int zero = 0, one = 0;
        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            if(ch == '1') one++;
            else zero++;
            total = Math.max(total, zero - one);
        }
        if(s.charAt(s.length() - 1) == '1') one++;
        return total + one;
    }
}
/* TC -> O(N^2) Solution
class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < n - 1; i++){
            //0 to i -> zero count
            int zeroCount = 0;
            for(int j = 0; j <= i; j++){
                if(s.charAt(j) == '0'){
                    zeroCount++;
                }
            }
            //i + 1 to n - 1 -> one count
            int oneCount = 0;
            for(int j = i + 1; j < n; j++){
                if(s.charAt(j) == '1'){
                    oneCount++;
                }
            }
            res = Math.max(res, zeroCount + oneCount);
        }
        return res;
    }
}
 */