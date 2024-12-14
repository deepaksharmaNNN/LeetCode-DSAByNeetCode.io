class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int row = 0;
        int[][] res = new int[n / 3][3];
        for(int i = 0; i < n; i += 3){
            if(nums[i + 2] - nums[i] <= k){
                for(int col = 0; col < 3; col++){
                    res[row][col] = nums[col + i];
                }
                row++;
            }else{
                return new int[0][0];
            }
        }
        return res;
    }
}