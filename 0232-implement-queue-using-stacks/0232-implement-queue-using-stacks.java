class MyQueue {

    Stack<Integer> S1;
    Stack<Integer> S2;
    public MyQueue() {
        S1=new Stack<>();
        S2=new Stack<>();
    }
    
    public void push(int x) {
        S1.push(x);
    }
    
    public int pop() {
        while(S1.size()>1){
            int el=S1.pop();
            S2.push(el);
        }
        int ans=S1.pop();

        while(S2.size()>0){
            int el=S2.pop();
            S1.push(el);
        }
        return ans;
    }
    
    public int peek() {
        while(S1.size()>1){
            int el=S1.pop();
            S2.push(el);
        }
        int ans=S1.peek();
        while(!S2.empty()){
            int el=S2.pop();
            S1.push(el);
        }
        return ans;
    }
    
    public boolean empty() {
        return S1.size()<=0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */