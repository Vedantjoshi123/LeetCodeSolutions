class Solution {
    // public int majorityElement(int[] nums) {
    //     int max = nums[0];  //2 
    //     for(int i=0; i<nums.length; i++){
    //         if(max<nums[i]){
    //             max = nums[i];  // 2
    //         }
    //     }
    //     int[] ans = new int[max];   // ans[2] = {0,0}
    //     for(int i=0; i<nums.length; i++){
    //         ans[nums[i]-1]++;     // = {1, 1}
    //     }
    //     int ansMax = ans[0];  // 1
    //     for(int i=0; i<max; i++){  // 0 - 2
    //         if(ansMax<ans[i]){   // 1<1
    //             ansMax = ans[i];
    //         }
    //     }
    //     return ansMax+1;
    // }
    
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}