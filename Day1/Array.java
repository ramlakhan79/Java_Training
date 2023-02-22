import java.util.Scanner;
public class Array {
    public static void main(String arg[]){
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+" "+(i+1)+" "+" value : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("The "+" "+(i+1)+" "+" value = "+arr[i]);
        }
    }
}
