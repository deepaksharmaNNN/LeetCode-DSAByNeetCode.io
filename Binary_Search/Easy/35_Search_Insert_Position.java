class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) {
                pos = mid + 1;
                start = mid + 1;
            } else {
                pos = mid;
                end = mid - 1;
            }
        }
        return pos;
    }
}