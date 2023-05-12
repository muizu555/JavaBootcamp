class SimpleNode{
    private int key;
    private SimpleNode prev;//ここのsimpleNodeはただ宣言しているだけ
    private SimpleNode next;

    public SimpleNode(int key) {//初期化だから //publicについて
        this.key = key;
        this.prev = null;
        this.next = null;
    }
    
    SimpleNode getPrev(){
        return  prev;
    }

    SimpleNode getNext(){
        return  next;
    }

    int getKey(){
        return key;
    }

    void setNext(SimpleNode next){
        this.next = next;
    }

    void setPrev(SimpleNode prev){
        this.prev = prev;
    }
}