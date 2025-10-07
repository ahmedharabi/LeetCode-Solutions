class MyStack {
    public Queue<Integer> Q1;
    public Queue<Integer> Q2;
    public MyStack() {
        Q1=new LinkedList<>();
        Q2=new LinkedList<>();
    }
    
    public void push(int x) {
        Q1.offer(x);
    }
    
    public int pop() {
        while(Q1.size()>1){
            int el=Q1.poll();
            Q2.offer(el);
        }
        int ans= Q1.peek();
        
        Q1.poll();
        //Q2.offer(el);

        while(Q2.size()>0){
            int el=Q2.poll();
            Q1.offer(el);
        }
        return ans;
    }
    
    public int top() {
        while(Q1.size()>1){
            int el=Q1.poll();
            Q2.offer(el);
        }
        int ans= Q1.peek();
        
        int el=Q1.poll();
        Q2.offer(el);

        while(Q2.size()>0){
            el=Q2.poll();
            Q1.offer(el);
        }
        return ans;
    }
    
    public boolean empty() {
        return Q1.size()<=0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */