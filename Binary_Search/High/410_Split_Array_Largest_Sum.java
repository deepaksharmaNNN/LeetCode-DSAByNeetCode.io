class Solution {
    private int helper(int[] arr, int value){
        int count = 1;
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            if(total + arr[i] <= value){
                total += arr[i];
            }else{
                count++;
                total = arr[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
         while(low <= high){
            int mid = (low + high) / 2;
            int total = helper(nums, mid);
            if(total > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}