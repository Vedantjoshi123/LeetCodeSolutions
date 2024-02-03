class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] ans = new int[]{-1, -1};
        // int start = 0;
        // int end = nums.length-1;
        // while(start<end){
        //     if(nums[start] == target){
        //         ans[0] = start;
        //     }
        //     start++;
        //     if(nums[end] == target){
        //         ans[1] = end;
        //     }
        //     end--;
        // }
        // return ans;

        int[] ans = new int[]{-1, -1};
        if(nums.length == 0){
            return ans;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        if(nums[start] != target){
            return ans;
        }
        ans[0] = start;
        end = nums.length;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        ans[1] = start-1;
        return ans;
    }
}