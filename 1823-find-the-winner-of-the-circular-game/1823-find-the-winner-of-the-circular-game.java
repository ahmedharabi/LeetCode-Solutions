class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        System.out.println(q.toString());
        while(q.size()!=1){
            int i=0;
            while(i<k){
                int el=q.remove();
                if(i!=k-1)q.add(el);
                i++;
            }
            System.out.println(q.toString());
        }
        return q.peek();

    }
}