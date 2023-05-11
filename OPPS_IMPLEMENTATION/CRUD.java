package OPPS_IMPLEMENTATION;
// CRUD- Create Read Update Delete
public interface CRUD {
	public Student[] read();
	public String save(Student student);
	public String update(Student student);
	public String delete(int roll_no);
}
