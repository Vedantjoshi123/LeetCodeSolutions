class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
            }
            else{
                ans[k] =nums2[j];
                j++;
            }
            k++;
        }  
        while(i<nums1.length){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        int s = 0;
        int e = ans.length-1;
        double fans = 0;
        int m = s + (e-s)/2;
        // for(int l=0; l<ans.length; l++){
        //     System.out.print(ans[l]);
        // }
        // System.out.print(ans[m]);
        // System.out.print(ans[m+1]);
        // System.out.print(ans.length);
        if(ans.length%2 == 0){
            // even
            fans = (double) (ans[m] + ans[m+1])/2;
        }
        else{
            fans = (double) (ans[m]);
        }
        return fans;
    }
}