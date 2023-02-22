public class ArrayException {
    public static void main(String arg[]){
        int arr[] = {10,20,30,40,50};
        try{
            System.out.println(arr[3]);
            System.out.println("Array is found");
        }        
        catch(Exception ob){
            System.out.println("Array is not found ");
        }

    }
}
