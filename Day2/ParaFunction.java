
/* WAJP to create parameterized function  */


import java.util.Scanner;
public class ParaFunction {
    void f1(int x , int y){
        System.out.println("Sum is : "+(x+y));
    }
    public static void main(String arg[]){
        int p,q;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        q = sc.nextInt();
        ParaFunction ob =new ParaFunction();
        ob.f1(p, q);
    }
}
