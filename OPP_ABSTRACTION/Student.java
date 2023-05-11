package OPP_ABSTRACTION;

import javax.sound.midi.Synthesizer;

public class Student  {
	int rollno;
	String name;
	
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public void show() {
		System.out.println(this.rollno+" "+ this.name);
	}

	@Override
	public String toString() {
		System.out.println( "Student [rollno=" + rollno + ", name=" + name + "]");
		return null;
	}
	
}
