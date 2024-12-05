class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(char ch : chars.toCharArray()){
            freq[ch - 'a']++;
        }
        int result = 0;
        for(String word : words){
            int[] currFreq = new int[26];
            for(char ch : word.toCharArray()){
                currFreq[ch - 'a']++;
            }
            boolean okay = true;
            for(int i = 0; i < 26; i++){
                if(currFreq[i] > freq[i]){
                    okay = false;
                    break;
                }
            }
            if(okay) result += word.length();
        }
        return result;
    }
}