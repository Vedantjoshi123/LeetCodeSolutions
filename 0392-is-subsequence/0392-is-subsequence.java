class Solution {
    public boolean isSubsequence(String s, String t) {
      int i=0,j=0;
    int m=t.length();
    int n=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(n<1)
        return true;

    while(i<m){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
        
        if(j==n)
            return true;
        }

        return false;  
    }
}