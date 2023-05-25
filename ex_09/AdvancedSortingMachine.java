class AdvancedSortingMachine extends SortingMachine{
   //protected Strategy strategy;

    public AdvancedSortingMachine(Strategy s){ 
        super(s);
    }

    //public void setStrategy(Strategy s){ strategy = s; }

    public void sort(int[] data){
        System.out.println(strategy.getClass().getName());
        long start = System.currentTimeMillis();
        strategy.sort(data);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time: "+time); 
    }
}