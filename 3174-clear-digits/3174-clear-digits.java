class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!st.empty())st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        if(st.empty())return "";
        StringBuilder ans=new StringBuilder("");
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}