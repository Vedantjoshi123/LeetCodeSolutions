class Solution {
    public int evalRPN(String[] tokens) {
        // Wrong :
        // int k =0;
        // int l = 0;
        // String[] operator;
        // String[] nums;
        // for(int i=0; i<tokens.length(); i++){
        //     if(tokens[i]=="+" || tokens[i]=="-" || tokens[i]=="*" || tokens[i]=="/"){
        //         operator[k] = tokens[i];
        //         k++;
        //     }
        //     else{
        //         nums[l] = tokens[i];
        //         l++;
        //     }
        // }
        // int i=0;
        // int j =0;
        // int ans =0;
        // while(i<nums.length() || j<operator.length()){
        //     ans = nums[i] + operator[j];
        //     i++;
        //     j++;
        // }
        
        // Method 2 : Using Stack
        Stack<Integer> s = new Stack<>();
        int i=0;
        while(i<tokens.length){
            if(tokens[i].equals("+")){
                int a = s.pop();
                int b = s.pop();
                s.push(b+a);
            }
            else if(tokens[i].equals("-")){
                int a = s.pop();
                int b = s.pop();
                s.push(b-a);
                
            }
            else if(tokens[i].equals("*")){
                int a = s.pop();
                int b = s.pop();
                s.push(b*a);
            }
            else if(tokens[i].equals("/")){
                int a = s.pop();
                int b = s.pop();
                s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }
        return s.pop();
    }
}