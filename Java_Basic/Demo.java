package Java_Basic;
class Demo{
	public static void main(String args[])
	{
		// for create object
		Student c=new Student(10,"Manish","10th");
		Student c1=new Student(11,"Ruchi","10th");
		
		System.out.println(c.name);
		System.out.println(c.rollno);
		c.fun();
		System.out.println(c1.name);
		System.out.println(c1.rollno);
		c1.fun();
		
	}
}
