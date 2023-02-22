interface I1{
    void show();
}
 class C1 implements I1{
    String name="Ramlakhan";
    public void show(){
        System.out.println(name);
    }

}
class C2 implements I1{
    int age=18;
    public void show(){
        System.out.println(age);
    }
}
class C3 implements I1{
    String email="ramlakhanlodhi229@gmail.com";
    public void show(){
        System.out.println(email);
    }
    public static void main(String arg[]){
        C1 ob= new C1();
        C2 ob1 = new C2();
        C3 ob2 = new C3();

        ob.show();
        ob1.show();
        ob2.show();
    }

}