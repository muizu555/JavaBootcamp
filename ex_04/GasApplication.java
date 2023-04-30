import java.util.*;
class GasApplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,M,n,m,id;
        int lane_num, min_size;
        int i;
        //Q型の配列を作っている。
        Queue []Q = new Queue[10];//オブジェクトを作っているコンストラクタが実行される。

        N = sc.nextInt();
	    M = sc.nextInt();

        for(i=0;i<N;i++){//レーンの数 1個ずつの中身
            Q[i] = new Queue(M);//Mより大きくはならないよね。
        }

        for(i=0;i<M;i++){
            n = sc.nextInt();


            if(n==0){
                m = sc.nextInt();
                System.out.println(Q[m-1].dequeue());
            }
            else{
                id = sc.nextInt();
                lane_num = 0;
                min_size = Q[0].getSize();
                for(int j=0;j<N;j++){
                    if(Q[j].getSize() < min_size){
                        min_size = Q[j].getSize();
                        lane_num = j;
                    }
                }
                Q[lane_num].enqueue(id);
            }

        }

    }

}