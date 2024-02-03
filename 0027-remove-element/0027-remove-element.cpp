class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
              int n=nums.size();
        map<int,int>mpp;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==val)
            {
                mpp[val]++;
                nums.erase(nums.begin()+i);
                i--;
            }
        }
        return n-mpp[val];
    }
};