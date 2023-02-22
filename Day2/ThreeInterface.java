/* Create three interface i1 , i2 , i3 , . i3 inherit to i2 , i2 inherit to i1 .
 * Create class p,q,r and this class inherit to i3  implement this scenario in java  */

 interface I1{
    void f1();
 }
 interface I2 extends I1{
    void f2();
 }
 interface I3 extends I2{
    void f3();

 }
 public class ThreeInterface implements I3{
    public void f1(){
        System.out.print("Hello");
    }
    public void f2(){
        System.out.println("hello1");
    }
    public void f3(){
        System.out.println("hello2");
    }

    public static void  main(String arg[]){
        ThreeInterface ob = new ThreeInterface();
        ob.f1();
        ob.f2();
        ob.f3();
    }
 }