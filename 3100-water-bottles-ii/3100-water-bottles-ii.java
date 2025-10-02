class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full=numBottles;
        int empty=0;
        int ans=0;
        while( !(numExchange >empty && full<=0)){
            if(empty<numExchange){
                ans+=full;
                empty+=full;
                full=0;
            }else{
                empty=empty-numExchange;
                full+=1;
                numExchange+=1;
            }
        }
        System.out.println(full+" "+empty+" "+numExchange);
        return ans;
    }
}