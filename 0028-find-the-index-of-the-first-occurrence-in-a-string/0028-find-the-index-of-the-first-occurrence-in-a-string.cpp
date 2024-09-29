class Solution {
public:
    int strStr(string haystack, string needle) {
        for (int i = 0; i < haystack.size(); i++) {
            if (haystack[i] == needle[0]) {
                int k = i + 1;
                bool str = true;
                for (int j = 1; j < needle.size(); j++) {
                    if (haystack[k] == needle[j]) {
                        k++;
                        cout<<" "<<str;
                        continue;
                    } else {
                        str = false;
                    }
                    
                }
                if (str)
                    return i;
                else
                    continue;
            }
        }
        return -1;
    }
};