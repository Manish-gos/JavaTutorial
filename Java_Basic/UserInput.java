package Java_Basic;
import java.util.Scanner;
class UserInput{
	public static void main(String[] agrs){
	Scanner sc=new Scanner(System.in);
	// read boolean value
	System.out.println("Enter Boolean value");
	boolean b=sc.nextBoolean();
	System.out.println(b);
	
	// read Character value
	System.out.println("Enter Character value");
	char c=sc.next().charAt(0);
	System.out.println(c);
	
	// read Integer value
	System.out.println("Enter Integer value");
	int i=sc.nextInt();
	System.out.println(i);
	
	// read Byte value
	System.out.println("Enter Byte value");
	byte by=sc.nextByte();
	System.out.println(by);
	
	// read short value
	System.out.println("Enter Short value");
	Short s=sc.nextShort();
	System.out.println(s);
	
	//// read long value
	System.out.println("Enter Long value");
	long l=sc.nextLong();
	System.out.println(l);
	
	// read float value
	System.out.println("Enter float value");
	float f=sc.nextFloat();
	System.out.println(f);
	
	// read double value
	System.out.println("Enter Double value");
	double d=sc.nextDouble();
	System.out.println(d);
	
	// read string value
	System.out.println("Enter String value");
	//read first word of line
	//String str=sc.next();
	
	//read full line
	String st=sc.nextLine();
	//System.out.println(str);
	System.out.println(st);
	
	
	
	}
}