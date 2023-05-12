class SimpleList implements Aggregate{
    private SimpleNode nil;

    SimpleList(){
       init();
   }

   void init(){//nillはオブジェクト //ここでnilを円状に表している。
       nil = new SimpleNode(0);
       nil.setNext(nil);
       nil.setPrev(nil);
   }

   SimpleNode listSearch(int key){
        SimpleNode current = new SimpleNode(0);//作るときにnewがいる
        current = nil.getNext();
        while (current != nil && current.getKey() != key) { // リストの最後まで探索する
            current = current.getNext();
        }
        if (current == nil) {
            return null; // 見つからなかった場合は null を返す
        } else {
            return current; // 見つかった場合はそのノードを返す
        }
   }



   void printList(){
       SimpleNode current = nil.getPrev();
        while (current != nil) {
            System.out.print(current.getKey() + " ");
            current = current.getPrev();
        }
        System.out.println(); // 改行して次の出力と区切る
   }

   

   void delete(int key){
      SimpleNode DeleteNode = listSearch(key);
      if(DeleteNode != null){
        DeleteNode.getPrev().setNext(DeleteNode.getNext());
        DeleteNode.getNext().setPrev(DeleteNode.getPrev());
      }
   }

   void insert(int key){
      SimpleNode newNode = new SimpleNode(key);//コンスタンスをここで呼び出して
      newNode.setPrev(nil.getPrev());
      newNode.setNext(nil);//nilは一番最後だから(現時点で)
      nil.getPrev().setNext(newNode);
      nil.setPrev(newNode);
      
   }

   public SimpleNode getNil(){
     return nil;
   }




    public Iterator forwardIterator(){
        return new SimpleListForwardIterator(this);
    }
    public Iterator backwardIterator(){
        return new SimpleListBackwardIterator(this); 
        
    }
}
