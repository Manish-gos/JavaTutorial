package OPP_ABSTRACTION;

public class Test {

	public static void main(String[] args) {
		System.out.println((50000.0/22)/9);
		String name="Manish,Ruchi,Ashu,Akash,Devesh";
		Student[] arr=new Student[6];
		String[] st=name.split(",");
		for (int i=0;i<st.length;i++) {
			arr[i]=new Student(i+1,st[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
			arr[i].toString();
		}
		
	}

}
