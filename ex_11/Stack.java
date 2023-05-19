public class Stack {
    private int[] a1; //new int[100];//配列オブジェクトを作っている
    private int top = 0;

    public Stack(){
        a1 = new int[100];
        top = 0;
    }

    public Stack(int num){
        a1 = new int[num];
    }

    

    public void push(int x) throws StackOverflowException{
        if(top == a1.length){
            throw new StackOverflowException(x);
        }
        a1[top] = x;
        top++; 
    }

    public int pop() throws StackUnderflowException{
        if(top-1 < 0){
            throw new StackUnderflowException();
        }
        top--;
        return a1[top];
    }

    public boolean isEmpty(){
        if(top <= 0) return true;
        else return false;
    }
}




