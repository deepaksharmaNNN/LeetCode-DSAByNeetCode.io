class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int p : prices){
            if(p < first){
                second = first;
                first = p;
            }else{
                second = Math.min(second,p);
            }
        }
        int leftOver = money - (first + second);
        return leftOver >= 0 ? leftOver : money;
    }
}