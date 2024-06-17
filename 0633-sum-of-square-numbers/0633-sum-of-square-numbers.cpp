class Solution {
public:
    bool judgeSquareSum(int c) {
        int i=0,j=sqrt(c);
        while(i<=j){
            if((pow(i,2)+pow(j,2))>c)j--;
            else if((pow(i,2)+pow(j,2))<c)i++;
            else return true;
        }
        return false;
    }
};