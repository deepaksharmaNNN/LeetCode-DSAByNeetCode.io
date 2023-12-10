class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int day = 0;
        int count = 0;
        for(int i = 1;i<=n;i++){
            total += i + day;
            if(i == 7){
                i = 0;
                day++;
            }
            count++;
            if(count == n) break;
        }
        return total;
    }
}