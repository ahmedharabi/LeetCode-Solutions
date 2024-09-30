class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {

        if (k >= nums.size()) {
            set<int> s1(nums.begin(), nums.end());
            cout << s1.size();
            if (s1.size() != nums.size())
                return true;
            return false;
        } else {
            set<int> s;
            for (int i = 0; i < k + 1; i++) {
                s.insert(nums.at(i));
            }
            if (s.size() < k + 1)
                return true;

            int i = 0, j = k + 1;

            while (j < nums.size()) {
                s.erase(nums.at(i));
                s.insert(nums.at(j));
                if (s.size() < k + 1)
                    return true;
                else if (j == nums.size() - 1)
                    return false;
                j++;
                i++;
            }
            return false;
        }
    }
};