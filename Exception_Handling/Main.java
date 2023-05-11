package Exception_Handling;

public class Main {

	public static void main(String[] args) {
		Throw_Throws th=new Throw_Throws();
		
			try {
				th.check(5, 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
