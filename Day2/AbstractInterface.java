
interface I1{
void f2();
}
abstract class Abstract implements I1{
    abstract void f1();
    public void f2(){
        System.out.println("f2");
    }
}
public class AbstractInterface extends Abstract{
    void f1(){
        System.out.println("f1");
    }
    public static void  main(String arg[]){
        
        AbstractInterface ob = new AbstractInterface();
        ob.f1();
        ob.f2();
    }
}
