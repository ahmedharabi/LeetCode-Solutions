class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> sortedHeights = heights;
        int s = 0;
        sort(sortedHeights.begin(), sortedHeights.end());
        for (int i = 0; i < heights.size(); i++) {
            if (heights.at(i) != sortedHeights.at(i))
                s++;
        }
        return s;
    }
};