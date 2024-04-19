class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))) count++;
        }
        int max = count;
        for(int i = k; i < s.length(); i++){
            if(set.contains(s.charAt(i - k))){
                count--;
            }
            if(set.contains(s.charAt(i))){
                count++;
            }
            max = Math.max(max, count);
        }
        return max;

    }
}