class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = candies[0];
        for(int i=1; i<candies.length; i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies < max){
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;
    }
}