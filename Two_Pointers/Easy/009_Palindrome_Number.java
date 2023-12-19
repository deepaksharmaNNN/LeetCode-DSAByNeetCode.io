class Solution {
    public int reverse(int x){
        int num = 0;
        while(x > 0){
            int rem = x % 10;
            num = num * 10 + rem;
            x = x / 10;
        }
        return num;
    }
    public boolean isPalindrome(int x) {
        if(x >= 0 && x <= 9) return true;
        int y = reverse(x);
        return x == y;
    }
}
