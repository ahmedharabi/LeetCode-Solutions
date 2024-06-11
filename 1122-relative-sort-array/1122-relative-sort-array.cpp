class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
     vector<int> t1;
    for(const int&e2:arr2){
        for(const int&e1:arr1){
            if(e2==e1){
                t1.push_back(e1);
            }

        }
    }
    sort(arr1.begin(),arr1.end());
    for(const int&e1:arr1){
        if(count(arr2.begin(), arr2.end(),e1)==0){
            t1.push_back(e1);

    }
}
    return t1;}
};