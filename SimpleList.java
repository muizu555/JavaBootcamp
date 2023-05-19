class SimpleList{
   private SimpleNode nil;

   SimpleList(){
       init();
   }

   void init(){
       nil = new SimpleNode();
       nil.setNext(nil);
       nil.setPrev(nil);
}
   SimpleNode listSearch(int key){
       /* your code */
   }

   void printList(){
       /* your code */
   }

   void delete(int key){
       /* your code */
   }

   void insert(int key){
       /* your code */
   }
}