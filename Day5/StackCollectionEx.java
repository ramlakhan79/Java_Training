import java.util.Stack;
class StackCollectionEx {
    public static void main(String arg[]){
        Stack<String> list = new Stack<String>();
        list.push("Ajay");
        list.push("Arun");
        list.push("Ram");
        System.out.println("Before Pop Element = "+list);
        list.pop();
        System.out.println("After Pop Element = "+list);
        System.out.println("Stack size = "+list.size());
    }
}
