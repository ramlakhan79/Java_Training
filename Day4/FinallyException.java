public class FinallyException {
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println(arr[9]);
        }
        catch(Exception e){
            System.out.println("Can not find array element");
        }
        finally{
            System.out.println("This block is always execute ");
        }
    }
}

