class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        int prev = 0;
        for(int i = 0; i < nums.length; i++){
            prefix[i] += nums[i] + prev;
            prev = prefix[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int rightVal = prefix[right];
        int leftVal = left == 0 ? 0 : prefix[left - 1];
        return rightVal - leftVal;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */