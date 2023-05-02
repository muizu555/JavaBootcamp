public class SortingMachine{


    public void sort(Relatable[] p){
        for (int i = 0; i < p.length; i++) {//縦の行
            for (int j = i+1; j < p.length; j++) {
                    if (p[i].isSmallerThan(p[j])) continue;
                    else{
                        Relatable temp = p[i];
                        p[i] = p[j];
                        p[j] = temp;
                    }
            }
        }
    }

}