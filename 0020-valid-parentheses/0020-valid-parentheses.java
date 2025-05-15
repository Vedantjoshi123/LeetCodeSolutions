class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char currEle = s.charAt(i);
            if(currEle == '(' || currEle == '[' || currEle == '{'){
                st.push(currEle);
            }
            else{
                if( ((currEle == ')') && (st.peek() != '(')) || 
                    ((currEle == '}') && (st.peek() != '{')) || 
                    ((currEle == ']') && (st.peek() != '['))
                ){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }
        return false;















        // Stack<Character> stack = new Stack<>();
        // char[] ch = s.toCharArray();
        // for(int i=0; i<ch.length; i++){
        //     // if(ch[i] == '(' || ch[i] == '{'  || ch[i] == '['){
        //     if(stack.isEmpty()){
        //         stack.push(ch[i]);
        //     }
        //     else {
        //         // if((stack.peek() == '(' && ch[i] == ')') || (stack.peek() == '{' && ch[i] == '}') || (stack.peek() == '[' && ch[i] == ']')){
        //         //     stack.pop();
        //         // }
        //         if(ch[i] - stack.peek() == 1 || ch[i] - stack.peek() == 2){
        //             stack.pop();
        //         }
        //         else{
        //             stack.push(ch[i]);
        //         }
        //     }
        // }
        // if(stack.isEmpty()){
        //     return true;
        // }
        // return false;

        // Stack<Character> stack = new Stack<>();
        // char[] ch = s.toCharArray();
        // for(int i=0; i<ch.length; i++){

        // }
    }
}