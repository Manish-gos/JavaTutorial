package OPPS_INHERITANCE;

public class Circule extends Shapes {
	int radius;
	public Circule(int radius) {
		this.radius=radius;
	}
		
	@Override
	public void description() {
		System.out.println("we have a circule which radius is "+this.radius);
	}
	
	@Override
	public void area() {
		Double area=Math.PI*Math.pow(this.radius, 2);
		System.out.println("the area of circule is "+area);
	}
}
