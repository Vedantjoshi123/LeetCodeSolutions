class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i : nums){
            if(i>=0){
                positive.add(i);
            }
            else{
                negative.add(i);
            }
        }
        int k = 0;
        for(int i=0; i<nums.length/2; i++){
            nums[k++] = positive.get(i);
            nums[k++] = negative.get(i);
        }
        return nums;
    }
}