class Solution {
    public String largestGoodInteger(String num) {
        int res = -1;
        int cnt = 0;
        int prev = -1;
        for(char ch : num.toCharArray()){
            int number = ch - '0';
            if(number == prev){
                cnt++;
                if(cnt == 3){
                    int currNumber = number * 100 + number * 10 + number;
                    if(currNumber > res){
                        res = currNumber;
                    }
                }
            }else{
                cnt = 1;
                prev = number;
            }
        }
        if(res == -1) return "";
        if(res == 0) return "000";
        return Integer.toString(res);
    }
}