class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        vector<int> g1 = edges.at(0), g2 = edges.at(1);
        if (g1.at(0) == g2.at(0))
            return g1.at(0);
        else if (g1.at(0) == g2.at(1))
            return g1.at(0);
        else if (g1.at(1) == g2.at(0))
            return g1.at(1);
        else if (g1.at(1) == g2.at(1))
            return g1.at(1);
        return g1.at(0);
    }
};