class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
        int full=numBottles;
        int ans=0;
        while(full>0){
            ans+=full;
            empty+=full;
            full=empty/numExchange;
            empty=empty-(full*numExchange);
        }
        return ans;
    }
}