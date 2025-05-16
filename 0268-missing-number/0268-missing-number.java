class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-1; i++){
            if(nums[i]+1 != nums[i+1]){
                return nums[i]+1;
            }
        }
        return nums[i]+1;

        // optimized: 
        // int xor = 0, i = 0;
        // for (i = 0; i < nums.length; i++) {
        //     xor = xor ^ i ^ nums[i];
        // }
	    // return xor ^ i;
    }
}