class Base{
    void show(){
        System.out.println(" Base class ");
    }
}
public class MOverriding extends Base{

    void show(){
        super.show();
        System.out.println("Derived class");
    }
    public static void main(String arg[]){
        MOverriding ob =new MOverriding();
        ob.show();
    }
}
