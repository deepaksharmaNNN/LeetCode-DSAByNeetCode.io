class Solution {
    public int[] rearrangeArray(int[] nums) {
        int evenInd = 0;
        int oddInd = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(val > 0){
                res[evenInd] = val;
                evenInd += 2;
            }else{
                res[oddInd] = val;
                oddInd += 2;
            }
        }
        return res;
    }
}
/** TC O(N) SC(N) 2 Pass Algorithm
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(val < 0) neg.offer(val);
            else pos.offer(val);
        }
        int[] res = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length / 2; i++){
            res[k++] = pos.poll();
            res[k++] = neg.poll();
        }
        return res;
    }
}
 */