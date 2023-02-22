
class SuperClass{
    int number=10;
}
public class SuperKeyword extends SuperClass {
    int number=15;
    void show(){
        super.number=30; 
        System.out.println(super.number); // output 30
        System.out.println(number);  // output 15
    }
    public static void main(String arg[]){
        SuperKeyword ob = new SuperKeyword();
        ob.show();
    }
}
