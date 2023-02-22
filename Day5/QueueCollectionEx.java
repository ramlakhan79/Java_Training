import java.util.*;
class QueueCollectionEx {
    public static void main(String arg[])
    {       
        Queue<String> q = new PriorityQueue<String>();
        q.add("Vijay");
        q.add("Ram");
        q.add("Arun");
        System.out.println(q);// output [Arun,Vijay,Ram]
    }
}
