import java.util.Scanner;

class PrimeFactorizer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int i = 2;
        System.out.print(c+":");
        while (true){
            if(c==1) {
                System.out.println();
                break;
            }
            if(c%i==0){
                System.out.print(" "+ i);
                c = c/i;
            }
            else{
                i++ ;
                continue;
            }

        }
    }
}