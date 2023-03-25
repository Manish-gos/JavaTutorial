import java.util.*;
class TypeCasting{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number");
		 // implicit type castin
		 // when we try to store lower datatype into higher data type
		byte b=126;//sc.nextInt();
		int a=b;
		System.out.println(a);
		
		// Explicit type casting
		// when we try to store upper data type into lower data type
		int x=126;
		byte y=(byte)x;
		System.out.println(y);
		
		char c=(char)x;
		//int ch=c;
		System.out.println(c);
		
		double d=x;
		int db=(int)d;
		System.out.println(db);
		
	}
}