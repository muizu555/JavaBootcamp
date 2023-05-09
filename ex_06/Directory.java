public class Directory extends Entity{
    //private String name;
    private Entity[] allList = new Entity[100];
    private int numberOfEntity = 0;

    public Directory(String name){//ok
        super(name);
    }

    //public String getName(){ return name; }

    //public void rename(String name){this.name = name;}

    public int getSize(){
        int total = 0;
        for ( int i = 0; i < numberOfEntity; i++ ){
            total += allList[i].getSize();
        }
        return total;
    }
    

    public void add(Entity entity){
        allList[numberOfEntity++] = entity;
    }

    public void display(){
        for ( int i = 0; i < numberOfEntity; i++ ){
            System.out.print(allList[i].getName() + " "); 
        }
        System.out.println();
        System.out.println(this.getSize() + " bytes");
    }
}
