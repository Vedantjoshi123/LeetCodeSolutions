class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hash table
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();   // 1st => nums[i], 2nd => i
        for(int i=0;i<nums.length; i++){
            if(map.containsKey( target - nums[i])){
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;










        // int[] ans = new int[2];
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j =i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
        

// Time Limit Exceeded
        //  Arrays.sort(nums);
        // int[] ans = new int[2];
        // int start = 0;
        // int end = nums.length-1;
        // while(start<=end){
        //     if(nums[start] + nums[end] == target){
        //         ans[0] = start;
        //         ans[1] = end;
        //     }
        //     else if(nums[start] + nums[end] > target){
        //         end--;
        //     }
        //     else{
        //         start++;
        //     }
        // }
        // return ans;
        
    }
}