class Solution {
    private boolean verify(String s1, String s2, Map<Character,Integer> map){
        int i1 = 0;
        int i2 = 0;
        while(i1 < s1.length()  && i2 < s2.length()){
            if(s1.charAt(i1) != s2.charAt(i2)){
                if(map.get(s1.charAt(i1)) < map.get(s2.charAt(i2))) return true;
                else return false; 
            }
            i1++;
            i2++;
        }
        if(s1.length() > s2.length()) return false;
        return true;
    }
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        int weight = 1;
        for(char ch : order.toCharArray()){
            map.put(ch,weight++);
        }
        for(int i = 0; i < words.length - 1; i++){
            String first = words[i];
            String second = words[i + 1];
            if(!verify(first, second, map)) return false;
        }
        return true;
    }
}