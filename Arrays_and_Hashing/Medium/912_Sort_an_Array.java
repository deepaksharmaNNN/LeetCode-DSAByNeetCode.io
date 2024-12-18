class Solution {
    private int[] mergeSort(int[] nums){
        if(nums.length == 1) return nums;
        int mid = nums.length / 2;
        int[] first = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(first, second);
    }
    private int[] merge(int[] first, int[] second){
        int i = 0, j = 0, k = 0;
        int[] arr = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                arr[k++] = first[i++];
            }else{
                arr[k++] = second[j++];
            }
        }
        while(i < first.length){
            arr[k++] = first[i++];
        }
        while(j < second.length){
            arr[k++] = second[j++];
        }
         return arr;
    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

}