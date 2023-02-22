/* WAJP from reference variable  */

class ReVariable{
    int x=10;
    public static void main(String arg[]){
        ReVariable r ;
        ReVariable ob = new ReVariable();
        r=ob;
        System.out.println(r.x);
       // r=null;    // Error exeption in thread main 
       // System.out.println(r.x);

    }
}