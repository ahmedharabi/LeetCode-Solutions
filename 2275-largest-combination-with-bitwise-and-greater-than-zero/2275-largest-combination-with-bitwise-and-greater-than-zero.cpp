class Solution {
public:
    int largestCombination(vector<int>& candidates) {
        int s=0,nb=-1;
        for(int i=0;i<24;i++){
            s=0;
            for(int j=0;j<candidates.size();j++){
                int x=candidates.at(j) % 2 == 0 ? 0 : 1;
                candidates.at(j)=candidates.at(j)/2;
                if(x==1)s++;
            }
            nb=max(nb,s);
        }
        return nb;
        
    }
};