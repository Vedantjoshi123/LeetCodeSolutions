class Solution {
public:
    vector<int> sumZero(int n) {
        int num = -n/2;
        vector<int> ans;
        for(int i=0; i<n; i++){
            if(n%2 == 0 && num == 0){
                num++;
                ans.push_back(n/2);
            }
            else{
                ans.push_back(num++);
            }
            
        }
        return ans;
    }
};