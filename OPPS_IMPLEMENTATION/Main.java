package OPPS_IMPLEMENTATION;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select below options");
		System.out.println("1. Read Students details");
		System.out.println("2. insert Students details");
		System.out.println("3. Update Students details");
		System.out.println("4. delete Students details");
		System.out.println("5 press -1 for exit");
		
		CRUDImplementation cd=new CRUDImplementation();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter your selection- ");
			int input=sc.nextInt();
			
			if(input==1) {
				cd.read();
			}
			
			else if(input==2) {
				System.out.println("Insert roll no,name,subject");
				sc.nextLine();
				String[] info=sc.nextLine().split(" ");
				System.out.println(info[0]+info[1]+info[2]);
				Student student=new Student(Integer.parseInt(info[0]),info[1],info[2]);
				cd.save(student);
			}
			else if(input==3) {
				System.out.println("Insert roll no,name,subject");
				sc.nextLine();
				String[] info=sc.nextLine().split(" ");
				System.out.println(info[0]+info[1]+info[2]);
				Student student=new Student(Integer.parseInt(info[0]),info[1],info[2]);
				cd.update(student);
			}
			else if(input ==4)
				System.out.println("Enter roll number");
				int roll_no=sc.nextInt();
				cd.delete(roll_no);
			
		}
	}
}
