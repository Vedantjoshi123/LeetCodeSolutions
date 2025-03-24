class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(str);
        if(str.equals(""))
            return true;
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}