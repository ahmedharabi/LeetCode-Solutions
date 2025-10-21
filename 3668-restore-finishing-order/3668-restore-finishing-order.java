class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int[]ans=new int[friends.length];
        int j=0;
        for(int i=0;i<order.length;i++){
            int or=order[i];
            if(Arrays.stream(friends).anyMatch(x -> x == or)){
                
                ans[j]=order[i];
                j++;
            }
            
        }
        return ans;
    }
}