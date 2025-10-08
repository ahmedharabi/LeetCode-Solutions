class Solution {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) == -1)return word;
        Stack<Character> s=new Stack<>();
        int i=0;
        while( i < word.length() && word.charAt(i)!=ch){
            s.push(word.charAt(i));
            System.out.println(word.charAt(i));
            i++;
        }
        s.push(ch);
        i=0;
        StringBuilder str=new StringBuilder(word);
        while(!s.empty()){
            char c=s.pop();
            str.setCharAt(i,c);
            i++;
        }
        return str.toString();
    }
}