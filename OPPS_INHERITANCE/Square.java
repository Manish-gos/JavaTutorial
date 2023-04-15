package OPPS_INHERITANCE;

public class Square extends Shapes {
	int length;
	int width;
	
	public Square(int length,int width) {
		this.length=length;
		this.width=width;
	}
	
	@Override
	public void description() {
		System.out.println("we have a Square which length and width is "
	+this.length+" "+this.width);
	}
	
	@Override
	public void area() {
		int area=this.length*this.width;
		System.out.println("the area of square is "+area);
	}
}
