class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = new char[s.length()];
        Arrays.fill(arr, '0');
        int ind = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                if(arr[arr.length - 1] == '0'){
                    arr[arr.length - 1] = '1';
                }else{
                    arr[ind++] = '1';
                }
            }
        }
        return new String(arr);
    }
}