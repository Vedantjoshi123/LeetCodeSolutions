class Solution {
    public String reverseVowels(String s) {
        String vovels = "aeiouAEIOU";
        char[] charArray = s.toCharArray();
        int st = 0;
        int e = s.length()-1;
        while(st<e){
            if(vovels.contains(String.valueOf(charArray[st]))){
                if(vovels.contains(String.valueOf(charArray[e]))){
                    swap(charArray, st, e);
                    st++;
                    e--;
                }
                else{
                    e--;
                }
            }
            else{
                st++;
            }
        }
        return new String(charArray);
    }
    public void swap(char[] ca ,int a, int b){
        char temp = ca[a];
        ca[a] = ca[b];
        ca[b] = temp;
    }
}