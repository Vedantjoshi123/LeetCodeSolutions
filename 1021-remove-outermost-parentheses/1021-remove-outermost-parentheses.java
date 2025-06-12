class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        char[] carr= s.toCharArray();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(carr[i] == '('){
                count++;
                if(count > 1){
                    ans.append('(');
                }
            }
            else{
                if(count>1){
                    ans.append(')');
                }
                count--;
            }
        }

        return ans.toString();
    }
}