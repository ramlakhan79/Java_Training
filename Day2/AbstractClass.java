/* WAJP Abstract class  */
abstract class A{
    abstract void f1();
    void f2(){
        System.out.println(" Hello ");
    }
}
public class AbstractClass extends A {
    void f1(){
        System.out.println(" Abstract class ");
    }
    public static void main(String arg[]){
        AbstractClass ob = new AbstractClass();
        ob.f1();
        ob.f2();
    }
}
