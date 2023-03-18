import java.util.Scanner;
class Operators3{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		// Relational operators 
		System.out.println("Enter values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(a==b); //false 
		
		System.out.println(a!=b); //true
		
		System.out.println(a>b);  //false
		
		System.out.println(a>=b);  //false
		
		System.out.println(a<b);   //true
		
		System.out.println(a<=b);  //true
	}
}