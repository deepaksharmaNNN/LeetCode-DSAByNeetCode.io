class Solution {
    public boolean makeEqual(String[] words) {
        int[] arr = new int[26];
        int n = words.length;
        for(String word : words){
            for(char ch : word.toCharArray()){
                arr[ch - 'a']++; 
            }
        }
        return Arrays.stream(arr).allMatch(c -> c % n == 0);
    }
}
/* //good One
class Solution {
    public boolean makeEqual(String[] words) {
        int[] arr = new int[26];
        for(String word : words){
            for(char ch : word.toCharArray()){
                arr[ch - 'a']++; 
            }
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] % words.length != 0) return false;
        }
        return true;
    }
}
 */