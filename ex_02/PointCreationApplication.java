class Point{
    private int X = 0;
    private int Y = 0;



    void setX (int x){
        X = x;
    }

    void setY (int y){
        Y = y;
    }

    int getX(){
        return X;
    }

    int getY(){
        return Y;
    }


//ここまでがA


    void move (int dx,int dy){
        if((X+dx<-100 || X+dx>100 )|| (Y+dy<-100 || Y+dy>100)){//ここで関数が条件に満たしているかどうかの確認
            X = X;
            Y = Y;
        }
        else{
            X = X + dx;
            Y = Y + dy;
        }
    }
}

//ここまでがC
              

