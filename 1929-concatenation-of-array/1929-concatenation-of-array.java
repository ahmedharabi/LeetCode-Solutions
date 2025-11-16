class Solution {
    public int[] getConcatenation(int[] nums) {
        int m=nums.length*2;
        int[]ans=new int[m];
        for(int i=0;i<m;i++){
            ans[i]=nums[i%(m/2)];
        }
        return ans;
    }
}