class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int l = 0, r = k-1, out=0, cur=0;
        for (int i = l; i <= r; i++) {
            if (blocks[i] == 'W')
                out+=1;
        }
        
        while (r < blocks.size()) {
            for (int i = l; i <= r; i++) {
                if (blocks[i] == 'W')
                    cur++;
            }
            cout<<cur;
            out = min(out, cur);
            cur=0;
            r++;l++;
        }
        return out;
    }
};