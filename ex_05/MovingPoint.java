class MovingPoint extends Point{ 
    private int vx;
    private int vy;

    public MovingPoint(int x,int y){//ここがコンストラクタ
        super(x,y);//ここで継承している
    }


   
    void setVelocity(int x,int y){
        vx = x;
        vy = y;
    }
// setVelocity と　move は独自のものだから良さそう

    void move(){
        this.x += vx;
        this.y += vy;
    }


    


}