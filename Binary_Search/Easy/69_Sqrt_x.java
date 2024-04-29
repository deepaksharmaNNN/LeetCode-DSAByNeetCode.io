class Solution {
    public int mySqrt(int x) {
        long ans = 0;
        long low = 1, high = x;
        while(low <= high){
            long mid = (low + high) / 2;
            if(mid * mid <= x){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}