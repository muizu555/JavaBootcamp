class Point{
    public int x;  //変数の継承
    public int y;

    public Point(int x,int y){//ここでコンストラクトを用いて初期化
        this.x = x;
        this.y = y;
    }


    void print(){
        System.out.println("("+ x + ", "+ y + ")");
    }

    double getDistance(Point p2){
        int dx = p2.x - this.x;
        int dy = p2.y - this.y;

        return Math.sqrt(dx*dx + dy*dy);
    }


}