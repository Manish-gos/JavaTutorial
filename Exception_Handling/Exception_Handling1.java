package Exception_Handling;

import java.util.Scanner;

public class Exception_Handling1 {
	
	public static void main(String[] args) {
		int a=5;
		int b=0;
		String s=null;
		
		try {
			
			try {
				System.out.println("Manish".charAt(8));
			} catch(StringIndexOutOfBoundsException ao) {
				System.out.println(ao);
			}
			System.out.println(s.indexOf('a'));
			System.out.println(a/b);
		}
		
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException np) {
			System.out.println(np);
			System.out.println(1);
		}
		catch(Exception e) {
			System.out.println(2);
			System.out.println(e);
		}
		
		
		
		

	}

}
