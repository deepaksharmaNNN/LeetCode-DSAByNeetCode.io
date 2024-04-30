class Solution {
    private int maxElement(int[] arr){
        int max = 0;
        for(int val : arr){
            max = Math.max(val, max);
        }
        return max;
    }
    private int helper(int[] arr, int mid){
        int hour = 0;
        for(int i = 0; i < arr.length; i++){
            hour += Math.ceil((double)arr[i] / (double)mid);
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxElement(piles);
        while(low <= high){
            int mid = (low + high) / 2;
            int totalHours = helper(piles, mid);
            if(totalHours <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}