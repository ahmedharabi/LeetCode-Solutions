class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        int l = 0, r = k - 1, out = 0;
        sort(nums.begin(), nums.end());
        out = (nums.at(r) - nums.at(l));
        while (r < nums.size()) {
            out = min(out, (nums.at(r) - nums.at(l)));
            r++;
            l++;
        }
        return out;
    }
};