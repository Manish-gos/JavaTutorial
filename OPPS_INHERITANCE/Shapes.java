package OPPS_INHERITANCE;

public class Shapes {
	
	public void description() {
		System.out.println("This method used to describe the shape");
	}
	
	public void area() {
		System.out.println("This method calculate area of shape");
	}
	
	//over loading
	public void area(int radius) {
		Double area=Math.PI*Math.pow(radius, 2);
		System.out.println("the area of circule is "+area);
	}
	
	public void area(int length,int width) {
		int area=length*width;
		System.out.println("the area of square is "+area);
	}

}
