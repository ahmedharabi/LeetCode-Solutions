class Solution {
public:
    bool isCircularSentence(string sentence) {
        if(sentence[0]!=sentence[sentence.size()-1])return false;
        int n=sentence.size()-1;
        for(int i=0;i<n;i++){
            if(sentence[i]==' ' && sentence[i-1]!=sentence[i+1] )return false;
        }
        return true;
    }
};