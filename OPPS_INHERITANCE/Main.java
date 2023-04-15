package OPPS_INHERITANCE;

public class Main {
	public static void main(String [] args) {
		Parents p=new Parents();
		p.sing();
		p.run();
		p.drink();
		System.out.println("---------------------");
		Child c=new Child();
		c.run();
		c.sing();
		c.art();
		c.drink();
		
		System.out.println("---------------------");
		Child2 c2=new Child2();
		c2.run();
		c2.sing();
		c2.dance();
		c2.drink();
		
	
		
	}

}
