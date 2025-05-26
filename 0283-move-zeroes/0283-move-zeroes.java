class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                temp[k++] = nums[i];
            }
        }
        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }
        for(int i=k; i<nums.length; i++){
            nums[i] = 0;
        }
       
       
       
       
       
       
       
       
       
       
        // int j = -1;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == 0){
        //         j = i;
        //     }
        // }
        // for(int i = j+1; i<nums.length; j++){
        //     if(nums[i] != 0);
        // }



        // int snowBallSize = 0; 
        // for (int i=0;i<nums.length;i++){
	    //     if (nums[i]==0){
        //         snowBallSize++; 
        //     }
        //     else if (snowBallSize > 0) {
	    //         int t = nums[i];
	    //         nums[i]=0;
	    //         nums[i-snowBallSize]=t;
        //     }
        // }
    }
}