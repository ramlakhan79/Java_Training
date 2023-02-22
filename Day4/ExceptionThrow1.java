public class ExceptionThrow1 {
    void f1(){
        try{
            throw new NullPointerException("Hello");
        }
        catch(NullPointerException e){
            throw e;
        }                          ////not complete
    }
    public static void main(String arg[]){
        ExceptionThrow1 ob = new ExceptionThrow1();
        ob.f1();
    }
}
