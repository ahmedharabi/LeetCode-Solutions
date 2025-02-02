class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int s=0,size=INT_MAX;
        int left=0,right=0;
        for(right=0;right<nums.size();right++){
            s+=nums.at(right);
            while(s>=target){
                size=min(size,right-left+1);
                s-=nums.at(left);
                left++;
                
            }
        }
        cout<<"left="<<left<<"right="<<right;
        if(left==0 && s<target)return 0;
        return size;
    }
};