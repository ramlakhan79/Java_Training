/* WAJP to take 10 integers value and display the result */
import java.util.Scanner;
class ForLoop{
public static void main(String arg[]){
 int x,n;
 Scanner sc=new Scanner(System.in);
System.out.print("Enter the Value");
n=sc.nextInt();
for(int i=0;i<n;i++){
 System.out.print("Enter the"+" "+(i+1)+" "+"Value");
 x=sc.nextInt();
 System.out.println("The"+" "+(i+1)+" "+"Value"+x);
}

}
}