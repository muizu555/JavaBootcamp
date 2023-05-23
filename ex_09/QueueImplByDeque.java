class QueueImplByDeque implements Queue{
    private Deque deque;

    QueueImplByDeque(){
        this.deque = new DequeImplByDLL();
    }

    public void enqueue(int key){
        deque.insertFront(key);
    }

    public int dequeue(){
        int key = deque.back();
        deque.removeBack();
        return key;
    }

    public int front(){
        return deque.front();
    }

    public int size(){
        return deque.size();
    }

    public boolean empty(){
        return deque.empty();
    }





}