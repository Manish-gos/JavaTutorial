package OPPS_POLYMORPHISAM;

public class Car {
	int speed=60;
	int average=25;
	
	/*
	 * public Car(int speed,int average) { this.speed=speed; this.average=average; }
	 */
	public void vehicale() {
		System.out.println("This is my car class");
	}
	
	public void run() {
		this.vehicale();
	}
	
	public void run(int speed) {
		System.out.println("vehicale is running with speed "+speed);
	}
	
	
}
