 class Super{
   void f1(){
    System.out.println("Super class ");
   }
}
public class Inheritance extends Super {
    void f2(){
        System.out.println("Sub class ");
    }
    public static void main(String arg[]){
        Inheritance ob = new Inheritance();
        ob.f1();
        ob.f2();
    }
}
