class Solution {
    public String largestOddNumber(String num) {
        
        int end = num.length()-1;
        while(end>=0){
            System.out.print("-->"+num.charAt(end));
            if(num.charAt(end) == '1' || num.charAt(end) == '3' || num.charAt(end) == '5' || num.charAt(end) == '7' || num.charAt(end) == '9'){
                System.out.println( "==> "+num.charAt(end) );
                return num.substring(0, end+1);
            }
            
            end--;
        }
        return "";
    }
}