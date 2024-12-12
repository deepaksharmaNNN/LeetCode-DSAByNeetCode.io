class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                max = Math.max(max, i - map.get(ch) - 1);
            }else{
                map.put(ch, i);
            }
        }
        return max;
    }
}
/* O(N ^ 2) Solution
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(j) == s.charAt(i)){
                    System.out.println(j - i - 1);
                    max = Math.max(max, j - i - 1);
                }
            } 
        }
        return max;
    }
}
 */
