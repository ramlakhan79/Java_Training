import java.util.Scanner;
public class Student {
    int age[] =new int[5];
    String name[] = new String[5];
    float cgpa[] = new float[5];
    void getData(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5;i++){
            System.out.print((i+1)+ " Student Enter name : ");
            name[i] = sc.next();
            System.out.print((i+1)+" Student Enter age : ");
            age[i] = sc.nextInt();
            System.out.print((i+1)+" Student Enter CGPA : ");
            cgpa[i] = sc.nextFloat();
        }
    }
    void showData(){
        for(int i =0;i<5;i++){
            System.out.println((i+1)+" Student Name : "+name[i]);
            System.out.println((i+1)+" Student Age : "+age[i]);
            System.out.println((i+1)+" Student CGPA : "+cgpa[i]);
        }
    }
    public static void main(String arg[]){
        Student ob = new Student();
        ob.getData();
        ob.showData();
    }
}
