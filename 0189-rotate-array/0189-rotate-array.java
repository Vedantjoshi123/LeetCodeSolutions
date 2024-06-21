class Solution {
    public void rotate(int[] nums, int k) {
        // Method 1:  Space : O(n)  Time : O(n)
        //  k = k % nums.length;
        // if(k==0 || nums.length == 0 || nums.length == 1){
        //     return;
        // }
        // int ans[] = new int[nums.length];
        // for(int i=0; i<k; i++){
        //     ans[i] = nums[nums.length-k+i];
        // }
        // for(int i=k; i<nums.length; i++){
        //     ans[i] = nums[i-k];
        // }
        // for(int i=0; i<ans.length; i++){
        //     nums[i] = ans[i];
        // }
        
        // Method 2: Bubble Sort: Time limit executed Error
        // k = k % nums.length;
        // if(k==0 || nums.length == 0 || nums.length == 1){
        //     return;
        // }
        // for(int i=0; i<k; i++){
        //     for(int j=nums.length-1; j>0; j--){
        //         int temp = nums[j];
        //         nums[j] = nums[j-1];
        //         nums[j-1] = temp;
        //     }
        // }
        
        // Method 3 : 
        k = k%nums.length;
        if(k==0 || nums.length == 0 || nums.length == 1){
            return;
        }
        int a = nums.length - k;
        reverse(nums, 0, a-1);
        reverse(nums, a, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
       
    }    
     public static void reverse(int[] nums, int s, int e){
            while(s<e){
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;
                e--;
            }
        }
}