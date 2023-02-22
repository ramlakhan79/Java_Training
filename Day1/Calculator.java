import java.util.Scanner;
public class Calculator {
    public static void main(String arg[]){
     int x,y;
     int a;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the first value : ");      
     x=sc.nextInt();
     System.out.print("Enter the second value : ");     
     y=sc.nextInt();     
     System.out.print("Enter the Perform Operation : ");
     a=sc.nextInt();
        // if(a==1){
        //     System.out.println("Addition is = "+(x+y));
        // }
        // else if(a==2){
        //     System.out.println("Subtraction is = "+(x-y));
        // }
        // else if(a==3){
        //     System.out.println("Multiplication is = "+(x*y));
        // }
        // else if(a==4){
        //     System.out.println("Division is = "+(x/y));
        // }
        // else{
        //     System.out.println("Wrong Choice ");
        // }
        switch(a){
            case 1: System.out.println("Addition is = "+(x+y));
                    break;
            case 2:  System.out.println("Subtraction is = "+(x-y));
                    break;
            case 3:   System.out.println("Multiplication is = "+(x*y));
                    break;
            case 4:   System.out.println("Division is = "+(x/y));
                    break;
            default : System.out.println("Wrong Choice ");   
                    break;     
        }
    }
}
