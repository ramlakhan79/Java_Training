import java.util.Stack;
import java.util.Scanner;
class StackCollectionEx {
    public static void main(String arg[]){
        Stack<String> list = new Stack<String>();
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice){
            case 1:list.push(sc.next());
                   System.out.println("Value Push");
                   break;
            case 2:list.pop(); 
                   System.out.println("Value Push");                  
                   break;
            case 3:System.out.println("Stack Element = "+list); 
                   break;
        }       
    }
}
