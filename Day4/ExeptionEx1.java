
import java.util.*;
public class ExeptionEx1 
{
    public static void main(String arg[])
    {
        int a=0,b=0,c=0,d=0,f=0,g=0,h=0,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify 3  Unique Positive integer ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Specify 2 Unique Positive integer ");
        d=sc.nextInt();
        f=sc.nextInt();
        g=a+b+c;
        System.out.println("Numerator Number "+g);
        h=d-f;
        System.out.println("Denominator Number "+h);
        try{
            if(h<=0){
            throw new ArithmeticException("Denominator can not be find");
            }
            else{
                r=h/g;
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught ! ");
            System.out.println(e.getMessage());
        }
        

    }
}
