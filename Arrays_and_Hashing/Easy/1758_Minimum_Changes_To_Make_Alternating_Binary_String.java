class Solution {
    public int minOperations(String s) {
        int startsWithZero = 0; //if even -> 0 otherwise -> 1 checking for match
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0 && s.charAt(i) == '0') startsWithZero++;
            if(i % 2 == 1 && s.charAt(i) == '1') startsWithZero++;
        }
        return Math.min(startsWithZero, s.length() - startsWithZero);
    }
}