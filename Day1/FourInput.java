/* WAJP to take four input one is int second is float 
  third is doubled and fourth is string and display the
  result all of them. */
import java.util.Scanner;
class FourInput {
	public static void main(String arg[]){
		int a;
		float b;
		double c;
		String d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextFloat();
		c=sc.nextDouble();
		d=sc.next();
		System.out.println(a+ " " +b +" " +c +" "+d);
	}
}