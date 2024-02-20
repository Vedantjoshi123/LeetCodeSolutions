class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arr = s.split(" ");
        // for(int i=arr.length-1; i>=0; i--){
        //     if(!arr[i].isEmpty()){
        //         return arr[i].length();
        //     }
        // }
        // return 0;
        
        int j = s.length()-1;
        while(s.charAt(j) == ' '){
            j--;
        }
        int count = 0;
        for(int i = j; i>=0; i--){
            if(s.charAt(i) != ' ' ){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
//         int counter = 0;

//         int j = s.length()-1;
//         while(s.charAt(j) == ' ') {
//             j--;
//         }
//         for(int i = j; i >= 0; i--) {
//             if(s.charAt(i) != ' ') {
//                 counter++;
//             }else{
//                 break;
//             }
//         }
//         return counter;
//     }