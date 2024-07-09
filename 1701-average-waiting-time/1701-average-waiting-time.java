class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans = 0;
        int ct = 0;
        
        for(int i=0; i<customers.length; i++){
            ct = Math.max(ct, customers[i][0]) + customers[i][1];
            int wt = ct - customers[i][0];
            ans += wt;
        }
        ans = ans/customers.length;
        return ans;
    }
}