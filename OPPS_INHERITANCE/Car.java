package OPPS_INHERITANCE;

public class Car {
	int speed;
	int average;
	
	public Car(int speed,int average) {
		this.speed=speed;
		this.average=average;
	}
	
	public void vehicale() {
		System.out.println("This is my car class");
	}
	
	public void run() {
		this.vehicale();
	}
}
