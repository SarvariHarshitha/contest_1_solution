//The approach is to use two stacks to make the newly added elements appear on the top of the stack, so that we can pop the first added element as the functionality of queue
class MyQueue {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();

    public MyQueue() {

    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if(s1.isEmpty()) return -1;
        return s1.pop();
        
    }
    
    public int peek() {
        if(s1.isEmpty()) return -1;
        return s1.peek();
        
    }
    
    public boolean empty() {
        return s1.isEmpty();
        
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
