public class Queue implements OpenList{
    private int[] a1 = new int[100];
    private int head;  //先頭の位置
    private int tail;

    public Queue(){
        head = 0;
        tail = -1;
    }



    public void push(int num){
        tail ++;
        a1[tail] = num;

    }

    public int pop(){
        int num;
        num = a1[head];
        head ++;
        return num;
    }

    public boolean isEmpty(){
        if(head > tail) return true;
        else return false;
    }


}