class Solution {
    public int singleNumber(int[] nums) {
        
        // for(int i=0; i<nums.length; i++){
        //     boolean flag = false;
        //     for(int j=0; j<nums.length; j++){
        //         if(i!=j && nums[i]==nums[j]){
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(flag == false){
        //         return nums[i];
        //     }
        // }
        // return 0;
        
        Map<Integer, Integer> map = new HashMap<>();// value and count
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Integer ele: map.keySet()){
            if(map.get(ele)==1){
                return ele;
            }
        }
        return -1;
        
        
    }
}