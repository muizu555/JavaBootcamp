public class StackOverflowException extends Exception{
    public StackOverflowException(){}

    public StackOverflowException(int details){//コンストラクタ２
        super("Overflow. "+details+" can not be pushed.");
    }
}