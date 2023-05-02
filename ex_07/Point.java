public class Point implements Relatable{
    private int x;
    private int y;


    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }


    public boolean isSmallerThan(Relatable other){
        Point otherPoint = (Point)other;//暗黙だとできない
        if(this.x < otherPoint.x) return true;
        else if (this.x == otherPoint.x){
            if(this.y < otherPoint.y) return true;
            else return false;
        }
        else return false;
    }
}