class Solution {
public:
    vector<int> minSubsequence(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        reverse(nums.begin(),nums.end());
        vector<int>ans;
        for(int i=0;i<nums.size();i++){
            ans.push_back(nums.at(i));
            int s1=accumulate(ans.begin(),ans.end(),0);
            int s2=accumulate(nums.begin(),nums.end(),0);
            if(s1>s2-s1)return ans;
        }
        return ans;
    }
};