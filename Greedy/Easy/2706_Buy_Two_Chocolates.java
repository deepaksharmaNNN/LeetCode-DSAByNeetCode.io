class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int num : prices){
            //smallest
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }else if(num < secondSmallest){
                secondSmallest = num;
            }
        }
        int total = smallest + secondSmallest;
        return total <= money ? money - total : money;
    }
}