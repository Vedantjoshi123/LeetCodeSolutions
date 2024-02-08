class Solution {
    public boolean isPowerOfTwo(int n) {
        long ans = 1;
        while(ans<n){
            ans = ans * 2;
        }
        
        if(ans == n){
            return true;
        }
        else{
            return false;
        }
    }
}