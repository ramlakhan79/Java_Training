interface I1{
    void f1();
}
interface I2{
    void f2();
    void f3();
}
public class MultipleInterface implements I1,I2{
    public void f1(){
        System.out.println("Hello");
    }
    public void f2(){
        System.out.println("ok");
    }
    public void f3(){
        System.out.println("bye");
    }
    public static void main(String arg[]){
        MultipleInterface ob = new MultipleInterface();
        ob.f1();
        ob.f2();
        ob.f3();
    }
}
