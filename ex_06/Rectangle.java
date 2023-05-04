class Rectangle extends Shape{
    protected Point[] P = new Point[4];

    //int array = new int[3]; //java


    public Rectangle(Point p1, Point p3){
        //P = new Point[]{p1,p3};//ここなんでインスタンス化してる？
        P[0] = p1;
        P[1] = new Point(p3.x,p1.y);//p2
        P[2] = p3;
        P[3] = new Point(p1.x,p3.y);//p4
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