class Solution {
public:
    string compressedString(string word) {
        string output;
        char cur = word[0];
        int count = 0, n = word.size();

        for (int i = 0; i < n; i++) {
            if (word[i] == cur) {
                count++;
            } else {
                while (count > 0) {
                    if (count <= 9) {
                        output += to_string(count) + cur;
                        break;
                    

                    } else {
                        output += to_string(9) + cur;
                        count = count - 9;
                    }
                }
                cur = word[i];
                count = 0;
                i = i - 1;
            }
        }
        while (count > 0) {
            if (count <= 9) {
                output += to_string(count) + cur;
                break;

            } else {
                output += to_string(9) + cur;
                count = count - 9;
            }
        }
        return output;
    }
};