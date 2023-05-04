class Circle extends Shape{
    protected Point p;//ここのprivateかprotectedの違いは？
    private int r;

    public Circle(Point a, int b){
        this.p = a;
        this.r = b;
    }

    public void move(int dx, int dy){
        p.x += dx;
        p.y += dy;
    }

    public void print(){
        super.print();
        System.out.println("(" + p.x + ", " + p.y + ") radius = "+r);
    }

}