class Solution {
    public int lengthOfLastWord(String s) {
        String[] ans = s.trim().split(" ");
        return ans[ans.length - 1].length();
    }
}