class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int curr = nums[0];
        int j=1;
        for(int i=0; i<nums.length; i++){
            if(curr == nums[i]){
                continue;
            }
            else{
                nums[j] = nums[i];
                curr = nums[i];
                j++;
            }
        } 
        return j;


    }
}