public class ConstThisKey {
    int x;
    int y;
    ConstThisKey(){
        this(4, 8);
        System.out.println("Hello ");
    }
    ConstThisKey(int x ,int y){
        this.x=x;
        this.y=y;
    }
    void show(){    
        // this(6 ,7);  Error generate
        System.out.println(x + " "+ y);
    }
    public static void main(String arg[]){
        ConstThisKey ob = new ConstThisKey();
        ob.show();
    }
}
