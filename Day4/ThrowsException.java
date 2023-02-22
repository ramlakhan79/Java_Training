public class ThrowsException{
    int arr[]= new int[]{1,2,3,4};
    void show()throws NullPointerException { ///static void show()
        System.out.println(arr[2]);
        System.out.println("hello");

        // throw new NullPointerException("\nNull pointer exception ");
    }
    public static void main(String arg[]) throws NullPointerException {
        ThrowsException ob = new ThrowsException();
        ob.show();
        //show(); if show function static 
    }
}

