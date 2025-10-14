class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int j=0;
        while(j<sandwiches.length){
            String qs=q.toString();
            if(q.peek()==sandwiches[j]){
                q.remove();
                j++;
            }
            else{
                int el=q.remove();
                q.add(el);
            }
            if(q.toString().equals(qs))break;
        }
        return q.size();
    }
}