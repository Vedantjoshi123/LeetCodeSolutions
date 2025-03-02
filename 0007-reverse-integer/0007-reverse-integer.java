class Solution {
    public int reverse(int x) {
        
        int ans = 0;
        int num = Math.abs(x);
        while(num>0){
            int rem = num%10;
            if((ans>(Integer.MAX_VALUE - rem) / 10)){
                return 0;
            }
            ans = ans*10 + rem;
            num /= 10;
        }
        if(x>0)
        return ans; 
        else
        return -ans;



        // int ans = 0;
        // if(x<0){
        //     int num = Math.abs(x);
        //     while(num>0){
        //         int rem = num%10;
        //         ans = ans*10 + rem;
        //         num /= 10;
        //     }
        //     return -(ans); 
        // }
        // else{
        //    while(x>0){
        //         int rem = x%10;
        //         ans = ans*10 + rem;
        //         x /= 10;
        //     }
        //     return ans; 
        // }
        

        // int rev = 0;
        // while(x!=0){
        //     int rem = x%10;
        //     x = x/10;
        //     if(rev>0 && rev>(Integer.MAX_VALUE - rem) / 10 || rev<0 && rev<(Integer.MIN_VALUE - rem) / 10 ){
        //         return 0;
        //     }
        //     rev = rev*10 + rem;
        // }
        // return rev;
    }
}