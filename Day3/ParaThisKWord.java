public class ParaThisKWord {
    int x;
    int y;
    void write(){
        this.show(6, 8);
    }
    void show(int x , int y){
        this.x=x;
        this.y=y;
        System.out.println(x +" "+y);
    }
    public static void main(String arg[]){
        ParaThisKWord ob = new ParaThisKWord();
        // ob.show(3,5);
        ob.write();
    }
}
