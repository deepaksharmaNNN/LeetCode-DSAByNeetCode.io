class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i = 0; i < tickets.length; i++){
            if(i <= k) time += Math.min(tickets[i], tickets[k]);
            else time+= Math.min(tickets[i], tickets[k] - 1);
        }
        return time;
    }
}
/*
TC -> More than N
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0, cnt = 0;
        int n = tickets.length;
        while(tickets[k] != 0){
            if(tickets[i % n] != 0){
                tickets[i % n] = tickets[i % n] - 1;
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}
 */