package OPPS_INHERITANCE;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Car c=new Car(60, 20); System.out.println(c.speed);
		 * System.out.println(c.average); c.run();
		 */
		
		Tata t=new Tata(70, 25, "Black");
		System.out.println(t.average);
		System.out.println(t.speed);
		System.out.println(t.colour);
		t.run();
		
	}

}
