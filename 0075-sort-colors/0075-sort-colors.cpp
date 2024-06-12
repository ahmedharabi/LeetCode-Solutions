class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i=0,j=nums.size()-1;
    while(j!=0){
        if(nums.at(j)<nums.at(i)){
            int aux=nums.at(j);
            nums.at(j)=nums.at(i);
            nums.at(i)=aux;
        }
        i++;
        if(j==i){
            i=0;
            j--;
        }


    }}
};