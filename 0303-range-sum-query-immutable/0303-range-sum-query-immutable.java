class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        int k = 1;
        while(k != nums.length){
            prefixSum[k] = prefixSum[k-1] + nums[k]; 
            k++;
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return (prefixSum[right]-prefixSum[left-1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */