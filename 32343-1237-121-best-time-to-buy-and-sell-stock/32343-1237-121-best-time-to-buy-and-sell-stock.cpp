class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int i=0,j=i+1,ans=0;
        while( j<prices.size()){
            if(prices.at(i)>=prices.at(j)){
                i=j;
            }
            else{
                ans=max(ans,prices.at(j)-prices.at(i));
                
            }j++;
        }
        return ans;
    }
};