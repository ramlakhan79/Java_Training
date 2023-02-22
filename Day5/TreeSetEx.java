import java.util.*;
public class TreeSetEx {
    public static void  main(String arg[])
    {
        int n;
        TreeSet<Integer> tr = new TreeSet<Integer>();
        System.out.print("Specify the Number of Elements to Insert in Tree Set :" );
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+" Element of TreeSet : ");
            tr.add(sc.nextInt());
        }
        System.out.println("The Element of TreeSet List : "+tr);

    }
}
