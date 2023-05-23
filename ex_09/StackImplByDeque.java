class StackImplByDeque implements Stack { 
    private Deque deque;
    StackImplByDeque(){
       this.deque = new DequeImplByDLL();
    }
   /* your codes */
    public void push(int x){
        deque.insertFront(x);
    }
    
    public int pop(){
        int key = deque.front();
        deque.removeFront();//これは順番逆かも
        return key;
    }

    public int top(){
        return deque.front();
    }

    public int size(){
        return deque.size();
    }

    public boolean empty(){
        return deque.empty();
    }

}