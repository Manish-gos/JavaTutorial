package Exception_Handling;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Plese give value grter then 0");
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("code execution completed");
		}
		System.out.println("Task completed");
	}

}
