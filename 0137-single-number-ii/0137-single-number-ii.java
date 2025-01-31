class Solution {
    public int singleNumber(int[] nums) {
          int ans = 0;
    for(int i = 0; i < 32; i++) {
        int sum = 0;
        for(int j = 0; j < nums.length; j++) {
            if(((nums[j] >> i) & 1) == 1) {
                sum++;
                sum %= 3;
            }
        }
        if(sum != 0) {
            ans |= sum << i;
        }
    }
    return ans;
        // int[] freqArr = new int[30000];
        // for(int i=0; i<nums.length; i++){
        //     freqArr[nums[i]]++;
        // }
        // for(int i=0; i<freqArr.length; i++){
        //     if(freqArr[i] == 1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}