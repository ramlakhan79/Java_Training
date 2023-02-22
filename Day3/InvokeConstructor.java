
class SuperClass{
    int number=9;
    SuperClass(int x){
        System.out.println(x);
    }
    void f1(){
        System.out.println("Hello");
    }
}public class InvokeConstructor extends SuperClass {
    void show(){
        super.number=10;
        super.f1();
        System.out.println(super.number);
    }
    InvokeConstructor(){
        super(3);
    }
    public static void main(String arg[]){
        InvokeConstructor ob = new InvokeConstructor();
        ob.show();

    }
}
