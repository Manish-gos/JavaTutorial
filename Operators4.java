import java.util.Scanner;
class Operators4{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		// Logical operators && || !
		boolean t=sc.nextBoolean();
		boolean f=sc.nextBoolean();
		System.out.println("-------Results----------");
		// And operator both the values are true then return true
		System.out.println(t && f);
		// Or operator any of the values are true then return true
		System.out.println(t || f);
		//Give opposite value
		System.out.println(!t);
		System.out.println(!f);
		
		
	}
}