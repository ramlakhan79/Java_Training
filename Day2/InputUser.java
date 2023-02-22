/*  WAJP to take input from user for three integer variable  and print the result */

import java.util.Scanner;
class InputUser{
	int a,b,c;
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		InputUser ob = new InputUser();
		System.out.print(" Enter first integer value  ");
		ob.a = sc.nextInt();
		System.out.print(" Enter second integer value ");
		ob.b = sc.nextInt();
		System.out.print(" Enter third integer value  ");
		ob.c = sc.nextInt();
		System.out.println(" First integer value  "+ob.a);
		System.out.println(" Second integer value "+ob.b);
		System.out.println(" Third integer value  "+ob.c);
	}
}