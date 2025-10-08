class Solution {
    public String removeOuterParentheses(String s) {
        ArrayList<String> arr=new ArrayList<>();
        Stack<Character> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }
            str+=s.charAt(i);
            if(st.empty()){
                arr.add(str);
                str="";
            }
        }
        String ans="";
        for(int i=0;i<arr.size();i++){
            ans+=arr.get(i).substring(1, (arr.get(i)).length()-1);
        }
        return ans;
    }
}