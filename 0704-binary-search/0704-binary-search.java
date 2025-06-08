class Solution {
    public int search(int[] nums, int target) {
        // Using recurrsion:
        int start = 0;
        int end = nums.length - 1;
        return bSearch(nums, start, end, target);
        
        // int start = 0;
        // int end = nums.length - 1;
        // while(start<=end){
        //     int mid = start + (end - start) / 2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[mid] < target){
        //         start = mid+1;
        //     }
        //     else{
        //         end = mid-1;
        //     }
        // }
        // return -1;
    }
    int bSearch(int[] arr, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return bSearch(arr, start, mid-1, target);
        }
        else return bSearch(arr, mid+1, end, target);
    }
}