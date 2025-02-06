import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> t = new ArrayList<>();
        for (String ee : nums) {
            t.add(new BigInteger(ee));
        }
        Collections.sort(t);
        return t.get(t.size() - k).toString();

        // int n = nums.length;
        // List<Integer> t = new ArrayList<>();
        // for(String ee : nums){
        //     t.add(Integer.parseInt(ee));
            
        // }
        // Collections.sort(t);
        // int x = 0;
        // for(int i=n; i>=0; i--){
        //     if(x == k){
        //         int a = t.get(i);
        //         return Integer.toString(a);
        //     }
        //     x++;
        // }
        // return "-1";
    }
}