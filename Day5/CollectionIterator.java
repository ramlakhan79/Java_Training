import java.util.ArrayList;
import java.util.Iterator;
public class CollectionIterator {    
    public static void main(String arg[]){
        ArrayList <String> list = new ArrayList<String>();  // Creating ArrayList
        list.remove("A"); /// Removing object in array List 
        list.add("B"); /// Adding object in array List 
        list.add("C");
        list.add("D");
        list.add("X");
        Iterator <String> itr = list.iterator(); 
        while(itr.hasNext()){
            System.out.print(" Array List is = "+itr.next());/// output [A,B,C,D] 
        }
        System.out.println("The size of Array List = "+list.size());  // size of list         
    }
}