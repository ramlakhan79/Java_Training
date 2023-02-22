 // Wrapper class is a mechanism where convert primituve into object 
 //  and object into primitive  
 
 class WrapperClass{
 public static void main(String arg[]){
    int a=1;
    Integer i =  Integer.valueOf(a);  // primitive to object type
    Integer j = a;
    System.out.println(a+ " "+i+" "+ j);
 }    
}