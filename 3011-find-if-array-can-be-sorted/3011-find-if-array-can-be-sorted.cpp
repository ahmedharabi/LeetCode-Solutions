class Solution {
public:
    bool canSortArray(vector<int>& nums) {
        vector<int> t = nums;
        sort(t.begin(), t.end());
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int j=i;
            auto it = std::find(t.begin(), t.end(), nums.at(i));
            int index=distance(t.begin(), it);
            while(j<index){
            
            int num1 = nums.at(i);
            int num2 = t.at(j);
            string num1B,num2B;
            while (num1 > 0) {
                num1B = (num1 % 2 == 0 ? "0" : "1") + num1B;
                num1 /= 2;
            }
            while (num2 > 0) {
                num2B = (num2 % 2 == 0 ? "0" : "1") + num2B;
                num2 /= 2;
            }
            num1 = nums.at(i);
            num2 = t.at(j);
            cout<<num1B<<" "<<num2B<< " ";
            if(count(num1B.begin(),num1B.end(),'1')!=count(num2B.begin(),num2B.end(),'1'))return false;
            j++;
            }
           
            

            
        }
        return true;
    }
};