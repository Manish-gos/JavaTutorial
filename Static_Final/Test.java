package Static_Final;

public class Test {
	//Global or static
	//instacnce 
	//local
	
	
	
	static {
		Person.gender = "Female";
	}
	

	public static void main(String[] args) {
		Person p=new Person(35);
		System.out.println(p.age+" "+p.hashCode());
		System.out.println(p.gender+" "+p.gender.hashCode());
		System.out.println(Person.gender.hashCode());
		
		Person p1=new Person(25);
		System.out.println(p1.gender.hashCode()+" "+p1.hashCode());
		p1.eat();
		
		Person p2=new Person(40);
		System.out.println(p2.gender.hashCode()+" "+p2.hashCode());
	
	}

}
