class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int n = arr.length;
        for(int i = n- 1;i >=0;i--){
            int currMax = arr[i];
            arr[i] = max;
            max = Math.max(currMax,max);
        }
        return arr;
    }
}