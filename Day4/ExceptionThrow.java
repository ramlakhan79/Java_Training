public class ExceptionThrow {
    void f1(){
        throw new NullPointerException();
    }
    public static void main(String arg[]){
        ExceptionThrow ob = new ExceptionThrow();
       try{
           ob.f1();
       }
       catch(Exception e){
        System.out.println("SUCCESSFUL RUN");
        System.out.println(e.getMessage());
       }
    }
}
