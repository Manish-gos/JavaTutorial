package OPPS_IMPLEMENTATION;
//Encapsulation
public class Student {
	private int roll_no;
	private String name;
	private String subject;
	private static String school_name;
	
	public Student(int roll_no, String name, String subject) {
		this.roll_no = roll_no;
		this.name = name;
		this.subject = subject;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getSchool_name() {
		return school_name;
	}
	public static void setSchool_name(String school_name) {
		Student.school_name = school_name;
	}

	
	public String show() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", subject=" + subject +", School Name="+school_name+ "]";
	}
	
	
	
}
