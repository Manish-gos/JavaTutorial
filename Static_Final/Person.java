package Static_Final;

public class Person {
	//instance 
	int age;
	
	//static or global
 static String gender="Male";
	
	Person(int age){
		this.age=age;
	}
	
	
	void eat() {
		//local variable
		int a=12;
		System.out.println("Person eat at time"+a);
		System.out.println(gender.hashCode()+" "+gender);
	}

	
}
