class Solution {
    private int helper(int[] arr, int cap){
        int day = 1;
        int load = 0;
        for(int i = 0; i < arr.length; i++){
            if(load + arr[i] > cap){
                day++;
                load = arr[i];
            }else{
                load += arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int num : weights){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(helper(weights, mid) <= days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}