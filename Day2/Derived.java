import  java.util.Scanner;
class Base {
    int age;
    String name;
    void getData(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt(age);
    }
    void showData(){
        System.out.println("Student name : " +name);
        System.out.println("Student age : " +age);
    }
}
class Derived extends Base{
    String email;
    void get_eid(){
        Scanner sc = new Scanner(System.in);
        email = sc.next();
    }
    void show_eid(){
        System.out.println("Student email : " +email);
    }
    public static void main(String arg[]){
        Derived ob = new Derived();
        ob.getData();
        ob.get_eid();
        ob.showData();
        ob.show_eid();
    }
}
