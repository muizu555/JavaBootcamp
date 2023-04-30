public class Queue{
    private int[] lane;
    private int head;  //先頭の位置
    private int tail;  //末尾の位置
    private int size;

    Queue(int Qsize){
        lane = new int[Qsize];
        tail = -1;
        head = 0;
        size = 0;
    }


    public void enqueue(int num){
        tail ++;
        lane[tail] = num;
        size ++;
    }

    public int dequeue(){
        int num;
        num = lane[head];
        head ++;
        size --;
        return num;
    }

    public int getSize(){
        return size;
    }

}











