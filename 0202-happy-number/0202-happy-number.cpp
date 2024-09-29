class Solution {
public:
    bool isHappy(int n) {
        set<int> s;
        while (s.find(n) == s.end()) {
            s.insert(n);
            int k = 0;
            while(n!=0) {
                int d = (n % 10);
                k = pow(d, 2) + k;
                n = n / 10;
            }
            
            if (k == 1)
                return true;
            else
                n = k;
        }
        return false;
    }
};