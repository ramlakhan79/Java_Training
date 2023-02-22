/* Using this keyword we can distingwish local & instance .  */

class ThisKeyword{
    int x=10;  //instance variable
    int y=20;
    void show(){
        int x=5; // local  variable
        int y=15;
        this.y=y;//initialize instance variable 
        System.out.println(x + " " + y);
        System.out.println(this.x + " "+ this.y);
    }
    public static void main(String arg[]){
        ThisKeyword ob =new ThisKeyword();
        ob.show();
    }
}