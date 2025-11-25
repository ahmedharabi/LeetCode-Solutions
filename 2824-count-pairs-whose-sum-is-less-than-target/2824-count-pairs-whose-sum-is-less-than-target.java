class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i=0;
        int j=i+1;
        int ans=0;
        while(i<nums.size()-1&&j<nums.size()){
            if(nums.get(i)+nums.get(j)<target)ans++;
            j++;
            if(j==nums.size()){
                i++;
                j=i+1;
            }
        }
        return ans;
    }
}