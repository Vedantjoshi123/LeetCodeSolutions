class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[] = new int[queries.length];
        int k =0;
        while(k != queries.length){
            int start = queries[k][0];
            int end = queries[k][1];
            int res = arr[start];
            for(int i=start+1; i<=end; i++){
                res = res ^ arr[i];
            }
            ans[k] = res;
            k++;
        }
        return ans;
    }
}