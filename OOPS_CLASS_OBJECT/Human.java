package OOPS_CLASS_OBJECT;

public class Human {
//Data Members
	String name;
	char gender;
	
	//constructor
	public Human(String n,char g) {
		name=n;
		gender =g;
	}
	
	public Human() {
		
	}
	
	//Methods
	public void eat() {
		System.out.println(name+" can eat 5 chapati in a day");
	}
	
	public void speak() {
		System.out.println(name+" can speak english");
	}
	
	
}
