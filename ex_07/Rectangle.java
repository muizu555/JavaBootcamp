public class Rectangle implements Relatable{
    private Point p1;
    private Point p3;
    private int S;



    public Rectangle(Point p1,Point p3){
        this.p1 = p1;
        this.p3 = p3;
    }


    public int getArea(){
        int dirx = this.p3.getX() - this.p1.getX();
        int diry = this.p3.getY() - this.p1.getY();

        this.S = dirx*diry;
    
        return S;
    }

    public boolean isSmallerThan(Relatable other){
        Rectangle otherPoint = (Rectangle)other;//暗黙だとできない //直sつ
        if(this.S < otherPoint.getArea()) return true;//メソッドは参照できる
        else return false;
    }

}