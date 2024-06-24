class Solution {
    public int maxSubArray(int[] nums) {
        // Time Limit Exceeded:
        // if (nums.length == 1) {
        //     return nums[0];
        // }
        // int ans = nums[0];
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         if(sum > ans){
        //             ans = sum;
        //         }
        //     }
        // }
        // return ans;
        
        if (nums == null || nums.length == 0) {
            return 0; // edge case handling
        }
        
        int max_sum = nums[0];
        int current_sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            max_sum = Math.max(max_sum, current_sum);
        }
        
        return max_sum;
         
    }
}