class Solution {
    public int maxProductDifference(int[] nums) {
        int largest = -1, secondLargest = -1;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int num : nums){
            //smallest
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest){
                secondLargest = num;
            }
            //largest
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }else if(num < secondSmallest){
                secondSmallest = num;
            }
        }
        return (largest * secondLargest) - (smallest * secondSmallest); 
    }
}