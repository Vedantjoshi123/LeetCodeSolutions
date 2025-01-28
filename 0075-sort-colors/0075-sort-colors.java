class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=0; j<nums.length-i-1; j++){
        //         if(nums[j]>nums[j+1]){
        //             swap(nums, j, j+1);
        //         }
        //     }
        // }

        // bubble sort method:
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    swap(nums, i, j);
                }
            }
        }
        
    }
    public void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}