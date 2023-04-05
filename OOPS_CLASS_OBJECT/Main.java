package OOPS_CLASS_OBJECT;

public class Main {

	public static void main(String[] args) {
		Human ruchi=new Human("Ruchi", 'F');
		System.out.println(ruchi.name);
		System.out.println(ruchi.gender);
		ruchi.eat();
		ruchi.speak();
		
		Human manish=new Human();
		System.out.println(manish.name);
		System.out.println(manish.gender);
		manish.eat();
		manish.speak();
	}

}
