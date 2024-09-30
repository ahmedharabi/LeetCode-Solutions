class Solution {
public:
    int findLHS(vector<int>& nums) {
        set<int> s(nums.begin(),nums.end());
        int maxi=0;
        for(const int& e:s){
            if(count(nums.begin(),nums.end(),e+1)>0){
                int val=count(nums.begin(),nums.end(),e)  + count(nums.begin(),nums.end(), e+1);
                maxi=max(maxi,val);
            }
        }
        return maxi;
    }
};