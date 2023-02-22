import java.util.ArrayList;
public class CollectionSize {    
    public static void main(String arg[]){
        ArrayList <String> list = new ArrayList<String>();  // Creating ArrayList
        list.add("A"); /// Adding object in array List 
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("X");
        System.out.println("Array List is = "+list);/// output [A,B,C,D] 
        System.out.println("The size of Array List = "+list.size());  // size of list  
    }
}