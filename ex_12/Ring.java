import java.util.Scanner;

class Ring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();

        s = s + s;//ここで円にしている

        if(s.indexOf(p) == -1)System.out.println("No");
        else System.out.println("Yes");
    }
}