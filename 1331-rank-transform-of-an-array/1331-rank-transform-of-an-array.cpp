class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<int> v;
        set<int> s(arr.begin(),arr.end());
        vector<int> t(s.begin(),s.end());

        sort(t.begin(),t.end());
        map<int,int> m;
        for(int i =0;i<t.size();i++){
            v.push_back(i+1);
        }
        for(int i =0;i<t.size();i++){
            m[t.at(i)]=v.at(i);
        }
        vector<int> output;
        for(int i=0;i<arr.size();i++){
            output.push_back(m[arr.at(i)]);
            
        }
        return output;
        
    }
};