class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        int sum2 = 0;
        for(int i=0; i<nums.length; i++){
            sum2 += nums[i];
        }
        return (sum-sum2);


    //  TC = O(n)    SC = O(n)
        // int[] result = new int[nums.length+2];
        // for(int i=0; i<nums.length; i++){
        //     result[nums[i]] = 1;
        // }
        // for(int i=0; i<result.length; i++){
        //     if(result[i] != 1){
        //         return i;
        //     }
        // }
        // return 0;

        
        // Arrays.sort(nums);
        // int i;
        // if(nums[0] != 0) return 0;
        // for(i=0;i<nums.length-1; i++){
        //     if(nums[i]+1 != nums[i+1]){
        //         return nums[i]+1;
        //     }
        // }
        // return nums[i]+1;

        // optimized: 
        // int xor = 0, i = 0;
        // for (i = 0; i < nums.length; i++) {
        //     xor = xor ^ i ^ nums[i];
        // }
	    // return xor ^ i;
    }
}