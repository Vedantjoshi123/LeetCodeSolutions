class Solution {
    public int[] sortedSquares(int[] nums) {
        int s =0;
        int e = nums.length-1;
        int ans[] = new int[nums.length];
        int k = nums.length-1;
        while(s<=e){
            int n1 = Math.abs(nums[s]);
            int n2 = Math.abs(nums[e]);
            if(n1*n1 > n2*n2){
                ans[k--] = n1*n1;
                s++;
            }
            else{
                ans[k--] = n2*n2;
                e--;
            }
        }
        return ans;
        // for(int i=0; i<nums.length; i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
 
 
        // int left = 0;
        // int right = nums.length-1;
        // int result[] = new int[nums.length];
        // int i = nums.length-1;
        // while(left<=right){
        //     if(Math.abs(nums[left]) > Maths.abs(nums[right])){
        //         result[i] = nums[left]*nums[left];
        //         left--;
        //     }
        //     else{
        //         result[i] = nums[right]*nums[right];
        //         right--;
        //     }
        //     i--;
        // }
        // return result;
    }
}