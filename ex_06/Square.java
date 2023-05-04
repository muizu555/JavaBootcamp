class Square extends Shape{
    protected Point[] P = new Point[4];
    private int w;

    public Square(Point p1,int w){
        P[0] = p1;
        P[1] = new Point(p1.x + w,p1.y);//p2
        P[2] = new Point(p1.x + w,p1.y+w);
        P[3] = new Point(p1.x,p1.y+w);//p4
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


