class Solution {
public:
    string reverseWords(string s) {
        string s1, s2="";
        int n = s.size();
        for (int i = n - 1; i >= 0; i--) {

            if (s[i] != ' ') {
                s1.push_back(s[i]);
                cout << s[i];

            } else if (s1 == "" && s[i] == ' ')
                continue;
            else {

                reverse(s1.begin(), s1.end());
                if (s2 != "") {
                    s2.push_back(' ');
                    s2.append(s1);
                } else {
                    s2.append(s1);
                }
                // cout<<s1;
                s1 = "";
            }
        }
        if(s1.size()>0 && s1!=" "){
        reverse(s1.begin(), s1.end());
                if (s2 != "") {
                    s2.push_back(' ');
                    s2.append(s1);
                } else {
                    s2.append(s1);
                }
        }
        return s2;
    }
};