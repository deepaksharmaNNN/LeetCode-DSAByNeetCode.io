class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        if(num1.equals("0") || num2.equals("0")) return "0";
        if(num1.equals("1")) return num2;
        if(num2.equals("1")) return num1;
        int[] res = new int[m + n];
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product += res[i + j + 1];// Add previous carry result to product
                res[i + j + 1] = product % 10; // add calc value
                res[i + j] += product / 10; // add carry
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int ele : res){
            if(sb.length() == 0 && ele == 0) continue;
            sb.append(ele);
        }
        return sb.toString();
    }
}