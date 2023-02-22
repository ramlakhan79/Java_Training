class Base{
    void show(){
        System.out.println("Base Class");
    }
}
public class MethodOverriding extends Base{
    void show(){
        System.out.println("Derived Class");
    }
    public static void main(String arg[]){
        Base b ;
        Base ob1 = new Base();
        MethodOverriding ob = new MethodOverriding();
        b=ob1;
        b.show();
        b=ob;
        b.show();
    }
}