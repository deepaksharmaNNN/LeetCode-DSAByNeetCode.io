class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) return sb.toString();
        for(int i = stack.size() - 1; i >= 0; i--){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}