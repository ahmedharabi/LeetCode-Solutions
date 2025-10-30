class Solution {
    public int smallestNumber(int n) {
        int x = n;
        while (true) {
            String binary = Integer.toBinaryString(x);
            if (!binary.contains("0")) {
                return x;
            }
            x++;
        }
    }
}