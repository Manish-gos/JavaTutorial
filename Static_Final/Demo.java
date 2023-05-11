package Static_Final;
//Variable- if variable is final then we can not change its value or reassign it
//method- if method is final then we can not override it
//class- if class is final then we can not make a child class of it
public class Demo {
	int a=10;
	final double pi=3.14;
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		System.out.println(d.a);
		d.a=30;
		System.out.println(d.a);
		System.out.println(d.pi);
		
		

	}

}
