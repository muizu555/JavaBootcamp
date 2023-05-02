class Point{
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj){//overrideするには型をobjectにしないといけないらしい
        if (obj == null) return false ;
        if (obj == this) return true;
        else{
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }
    }
}