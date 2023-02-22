import java.util.ArrayList;
public class CollectionRemove {    
    public static void main(String arg[]){
        ArrayList <String> list = new ArrayList<String>();  // Creating ArrayList
        list.remove("A"); /// Removing object in array List 
        list.add("B"); /// Adding object in array List 
        list.add("C");
        list.add("D");
        list.add("X");
        System.out.println("Array List is = "+list);/// output [A,B,C,D] 
        System.out.println("The size of Array List = "+list.size());  // size of list  
    }
}