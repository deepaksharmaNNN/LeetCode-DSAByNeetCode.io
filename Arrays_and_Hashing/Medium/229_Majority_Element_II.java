class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0, maj1 = 0, maj2 = 0;
        int n = nums.length;

        // Step 1: Boyer-Moore Voting Algorithm to find potential candidates
        for (int i = 0; i < nums.length; i++) {
            if (maj1 == nums[i]) {
                cnt1++;
            } else if (maj2 == nums[i]) {
                cnt2++;
            } else if (cnt1 == 0) {
                maj1 = nums[i];
                cnt1 = 1;
            } else if (cnt2 == 0) {
                maj2 = nums[i];
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        // Step 2: Verify if the candidates actually appear > n / 3 times
        int freq1 = 0, freq2 = 0;
        for (int num : nums) {
            if (num == maj1) freq1++;
            else if (num == maj2) freq2++;
        }

        List<Integer> res = new ArrayList<>();
        if (freq1 > n / 3) res.add(maj1);
        if (freq2 > n / 3) res.add(maj2);

        return res;
    }
}
