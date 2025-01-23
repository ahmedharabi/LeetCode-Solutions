class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        reverse(nums.begin(),nums.end());
        int n=nums.size();
        for (int i = 0; i < k; i++) {
           nums.push_back(nums.at(i));
        }
        
        reverse(nums.begin(),nums.end());nums.resize(n);
        }
        
};