/* WAJP to take three integer variable and these variables are initialize inside the main method */

class InitializeMM{
	int a,b,c;
	public static void main(String arg[]){
		InitializeMM ob = new InitializeMM();
		ob.a=10;
		ob.b=20;
		ob.c=30;		
		
		System.out.println(" First integer value  "+ob.a);
		System.out.println(" Second integer value "+ob.b);
		System.out.println(" Third integer value  "+ob.c);
	}
}