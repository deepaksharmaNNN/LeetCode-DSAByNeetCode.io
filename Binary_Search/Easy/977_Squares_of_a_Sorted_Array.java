class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int head = 0;
        int tail = nums.length - 1;
        int index = nums.length - 1;
        while(head <= tail){
            if(nums[head] < nums[tail]){
                res[index--] = nums[tail--];
            }else{
                res[index--] = nums[head++];
            }
        }
        return res;
    }
}