package OPPS_INHERITANCE;

public class Tata extends Car{
	String colour;
	
	public Tata(int speed,int average,String colour) {
		super(speed,average);
		this.colour=colour;
	}
	
	@Override
	public void vehicale() {
		System.out.println("This is my Tata car class");
	}
	
	@Override
	public void run() {
		super.vehicale();
		this.vehicale();
	}
}
