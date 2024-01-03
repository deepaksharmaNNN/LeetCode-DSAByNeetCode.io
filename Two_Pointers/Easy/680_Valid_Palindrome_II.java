class Solution {
    public boolean isPalindrome(String str, int left, int right){
        while(left < right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
        }
        return true;
    }
}