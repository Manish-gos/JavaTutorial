package OPPS_INTERFACE;

public class Test implements A,B {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Test is running");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.run();
	}

	

}
