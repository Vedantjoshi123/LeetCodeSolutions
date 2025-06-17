class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
                if(max < count){
                    max = count;
                }
            }
            else if(s.charAt(i) == ')'){
                st.pop();
                count--;
            }
        }
        return max;
    }
}