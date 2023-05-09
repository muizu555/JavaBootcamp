public class Stack implements OpenList{
    private int[] a1; //new int[100];//配列オブジェクトを作っている
    private int top;

    public Stack(){
        a1 = new int[100];
        top = 0;
    }

    

    public void push(int x){
        a1[top] = x;
        top++;
    }

    public int pop(){
        top--;
        return a1[top];
    }

    public boolean isEmpty(){
        if(top <= 0) return true;
        else return false;
    }
}




