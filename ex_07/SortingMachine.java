public class SortingMachine{


    public void sort(Point[] p){
        for (int i = 0; i < p.length; i++) {//縦の行
            for (int j = i+1; j < p.length; j++) {
                    if (p[i].isSmallerThan(p[j])) continue;
                    else{
                        Point temp = p[i];
                        p[i] = p[j];
                        p[j] = temp;
                    }
            }
        }
    }

}