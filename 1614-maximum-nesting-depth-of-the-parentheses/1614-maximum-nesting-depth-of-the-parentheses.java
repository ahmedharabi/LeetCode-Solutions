class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curr+=1;
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                curr-=1;
                st.pop();
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}