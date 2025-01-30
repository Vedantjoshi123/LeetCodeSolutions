class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        int score = 0;
        for (int j = 0; j < nums[0].length; j++) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }
            score += max;
        }
        return score;

        // int score = 0;
        // for(int i=0; i<nums.length; i++){
        // int maxIndex = largestNum(nums[i]);
        // System.out.print(maxIndex);
        // nums[i][maxIndex] = 0;
        // }
        // return score;
        // }
        // public static int largestNum(int[] arr){
        // int max = arr[0];
        // int maxIndx = 0;
        // for(int i=0; i<arr.length; i++){
        // if(arr[i]>max){
        // max = arr[i];
        // maxIndx = i;
        // }
        // }
        // return maxIndx;
        // }
    }
}