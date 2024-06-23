class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         for(int i=0; i<n; i++){
//             ans[i] = 1;
//         }
        
//         for(int i=0; i<n; i++){
//             int j = 0;
//             while(j<n){
//                 if(i==j){
//                     j++;
//                     continue;
//                 }
//                 ans[i] *= nums[j];
//                 j++;
//             }
//         }
//         return ans;
        // Answer is correct but TLE
        
        // method 2:
         int n = nums.length;
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++){
            ans[i] = 1;
        }
         
        int prefix = 1;
        for(int i=0; i<n; i++){
            ans[i] = prefix;
            prefix = prefix * nums[i];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }
        
        return ans;
        
    }
}