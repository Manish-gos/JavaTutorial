class Student {
	int rollno;
	String name;
	String standard;
	
	//constructor 
	public Student(int rollno,String name,String standard){
		this.rollno=rollno;
		this.name=name;
		this.standard=standard;
	}
	
	//methods
	public void fun()
	{
		System.out.println(name+" is enjoying");
	}
}