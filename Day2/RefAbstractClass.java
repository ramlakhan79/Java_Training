/* WAJP Abstract class  */
abstract class A{
    abstract void f1();
    void f2(){
        System.out.println(" Hello ");
    }
}
class B extends A{
    void f1(){
        System.out.println(" Hi");
    }
}
public class RefAbstractClass extends A {
    void f1(){
        System.out.println(" Abstract class ");
    }
    public static void main(String arg[]){
        A r;
        RefAbstractClass ob = new RefAbstractClass();
        B ob1 = new B();
        r=ob;
        r.f1();
        r.f2();
        r=ob1;
        r.f1();
    }
}
