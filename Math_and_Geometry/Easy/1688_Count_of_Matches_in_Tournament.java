class Solution {
    public int numberOfMatches(int n) {
        return n - 1;
    }
}
/*
class Solution {
    public int numberOfMatches(int n) {
        int num = n;
        int res = 0;
        while(num > 1){
            res += num / 2;
            if(num % 2 == 1){
                num = num / 2 + 1;
            }else{
                num = num / 2;
            }
        }
        return res;
    }
}
*/