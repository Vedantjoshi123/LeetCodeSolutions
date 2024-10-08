class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] strArr = str.split("\\s+");  // Use regex to handle multiple spaces
        int start = 0;
        int end = strArr.length-1;
        while(start<end){
            swap(strArr, start, end);
            start++;
            end--;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            ans.append(strArr[i]);
            if (i < strArr.length - 1) {
                ans.append(" "); 
            }
        }
        return ans.toString();
    }
    public void swap(String[] sa, int a, int b){
        String temp = sa[a];
        sa[a] = sa[b];
        sa[b] = temp;
    }
}