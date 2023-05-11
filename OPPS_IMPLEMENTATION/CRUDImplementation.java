package OPPS_IMPLEMENTATION;

public class CRUDImplementation implements CRUD{
	
	static Student[] s=new Student[10];
	
	static {
		Student.setSchool_name("Excellent Academy Mandleshwar");
		s[0]=new Student(1,"Ruchi","PCM");
		s[1]=new Student(2,"Manish","PCM");
		s[2]=new Student(3,"Romi","PCB");
		s[3]=new Student(4,"Vinay","Commarce");
		s[4]=new Student(5,"Ankita","PCB");
	}

	@Override
	public Student[] read() {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null)
			System.out.println(s[i].show());
		}
		return null;
	}

	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
			System.out.println(i);
			s[i]=student;
			System.out.println(s[i]);
			System.out.println(student.show());
			break;
			}
		}
		return "Student details inserted!";
	}

	@Override
	public String update(Student student) {
		for(int i=0;i<10;i++) {
			if(s[i]!=null && s[i].getRoll_no()==student.getRoll_no())
			s[i]=student;
		}
		return "Student details updeted!";
	}

	@Override
	public String delete(int roll_no) {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null && s[i].getRoll_no()==roll_no)
			s[i]=null;
		}
		return "Student details deleted!";
	}

}
