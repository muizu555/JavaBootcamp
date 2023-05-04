class Parallelogram extends Shape{
    protected Point[] P = new Point[4];
    private int w;

    public Parallelogram(Point p1, Point p3, int w){
        //P = new Point[]{p1,p3};
        P[0] = p1;
        P[1] = new Point(p1.x + w,p1.y);//p2
        P[2] = p3;
        P[3] = new Point(p3.x-w,p3.y);//p4
    }


    public void print(){
        super.print();
        for(int i = 0;i<P.length;i++){
            if (i>0) System.out.print("-");
            System.out.print("(" + P[i].x + ", " + P[i].y + ")");
        }
         System.out.println();
    }

    public void move(int dx, int dy){
         for(int i = 0;i<P.length;i++){
            P[i].x = P[i].x + dx;
            P[i].y = P[i].y + dy;
        }
    }

    








}