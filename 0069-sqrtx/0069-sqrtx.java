class Solution {
    public int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
         int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;  // mid is a potential answer
                left = mid + 1;  // try to find a larger value
            } else {
                right = mid - 1;  // mid is too large
            }
        }
        return ans;
    }
}