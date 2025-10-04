class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0, j = height.size() - 1, max = -99999, calc = 0;
        while (i < j) {
            calc = min(height.at(i), height.at(j)) * (j - i);
            if (calc > max)
                max = calc;
            if (height.at(i) > height.at(j)) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
};