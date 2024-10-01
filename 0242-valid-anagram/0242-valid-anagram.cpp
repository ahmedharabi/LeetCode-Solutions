class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<char> sV,tV;
        if(s.size()!=t.size())return false;
        for(int i=0;i<s.size();i++){
            sV.push_back(s.at(i));
            tV.push_back(t.at(i));
        }
        sort(sV.begin(),sV.end());
        sort(tV.begin(),tV.end());
        for(int i=0;i<s.size();i++){
            if(sV.at(i)!=tV.at(i))return false;
        }
        return true;
    }
};