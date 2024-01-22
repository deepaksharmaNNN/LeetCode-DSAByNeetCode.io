class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for(int num : nums){
            if(set.contains(num)){
                res[0] = num;
            }
            set.add(num);
        }
        for(int i = 1;i<= nums.length;i++){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}