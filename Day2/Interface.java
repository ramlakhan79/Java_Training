interface I1{
    void f1();
}
public class Interface implements I1 {
    public void f1(){
        System.out.println("Hello");
    }
    public static void main(String arg[]){
        Interface ob = new Interface();
        ob.f1();
    }
    
}
