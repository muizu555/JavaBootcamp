package package_ag;
public class Alpha{
   protected int u = 30;
   private int x = 120;
   int z = 86;//protect from subclass
   public void show(Gamma g){
       System.out.println("Alpha");
       System.out.println("u: " + u);
       System.out.println("v: " + g.v);
       System.out.println("w: " + g.w);
       System.out.println("x: " + x);
       System.out.println("z: " + z);
       System.out.println();
   }
}
