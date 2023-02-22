import java.util.*;
class  VectoreCollectionEx{
    public static void main(String arg[])
    {
        Vector<String> v =new Vector<String>(3);
        v.add("Ajay");
        v.add("Ram");
        v.add("Vishal");
        v.add("Ramlakhan");       
        System.out.println(v.capacity());/// capacity 12 
    }
}