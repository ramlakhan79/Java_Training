import java.util.ArrayList;
public class CollectionRemoveIf {    
    public static void main(String arg[]){
        ArrayList <String> list = new ArrayList<String>();  // Creating ArrayList
        list.add("Aashish");  
        list.add("Ajay"); /// Adding object in array List 
        list.add("Vishal");
        
        list.removeIf(n->(n.charAt(0)=='V'));    

        list.removeIf(n->(n.charAt(n.length()-1)=='y'));

        System.out.println("Array List is = "+list);
    }
}