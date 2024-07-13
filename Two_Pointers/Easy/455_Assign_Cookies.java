class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        Arrays.sort(greed);
        Arrays.sort(size);
        int left = 0, right = 0;
        while(left < greed.length && right < size.length){
            if(greed[left] <= size[right]){
                left++;
            }
            right++;
        }
        return left;
    }
}