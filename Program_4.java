class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public MyStack() {
        
    }
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int m=0;
        if(q1.isEmpty()) return -1;
        while(!q1.isEmpty()){
            m=q1.peek();
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            if(q2.peek()==m){
                q2.remove();

            }
            else q1.add(q2.remove());
        }
        return m;
        
    }
    
    public int top() {
       int m=0;
        if(q1.isEmpty()) return -1;
        while(!q1.isEmpty()){
            m=q1.peek();
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return m;
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
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
