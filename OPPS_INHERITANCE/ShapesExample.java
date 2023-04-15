package OPPS_INHERITANCE;

public class ShapesExample {

	public static void main(String[] args) {

		//circle
		Circule c=new Circule(7);
		c.description();
		c.area();
		c.area(10);
		
		//square
		Square s=new Square(50,20);
		s.description();
		s.area();
		s.area(100, 50);

	}

}
