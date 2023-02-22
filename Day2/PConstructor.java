import java.util.Scanner;

public class PConstructor {
    PConstructor(int x , int y){
        System.out.println("Sum is : "+(x+y));
    }
    public static void main(String arg[]){
        int p,q;
        Scanner sc = new  Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        PConstructor ob = new PConstructor(p,q);
    }
}
