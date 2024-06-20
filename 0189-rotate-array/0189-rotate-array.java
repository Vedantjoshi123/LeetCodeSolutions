class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length;
        if(k==0 || nums.length == 0 || nums.length == 1){
            return;
        }
        int ans[] = new int[nums.length];
        for(int i=0; i<k; i++){
            ans[i] = nums[nums.length-k+i];
        }
        for(int i=k; i<nums.length; i++){
            ans[i] = nums[i-k];
        }
        for(int i=0; i<ans.length; i++){
            nums[i] = ans[i];
        }
        
    }    
}