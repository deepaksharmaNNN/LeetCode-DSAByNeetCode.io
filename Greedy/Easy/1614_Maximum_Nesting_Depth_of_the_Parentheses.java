class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') cnt++;
            else if(ch == ')') cnt--;
            max = Math.max(cnt, max);
        }
        return max;
    }
}