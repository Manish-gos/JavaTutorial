class ConditionalStatment{
	public static void main(String args[])
	{
		int a=6;
		int b=3;
		// if, else if ,else
		if( a>b && b>0 ){
			System.out.println("a is grater then b");
		}
		else if (a >b && b>1)
			{
			System.out.println("a is grater then b is grater then 1");
		}
		else if (a >b && b>2)
			{
			System.out.println("a is grater then b is grater then 2");
		}
		else if (a >b && a==b*2)
			{
			System.out.println("a is grater then b is grater then 2");
		}
		else{
			System.out.println("a is smaller then b");
		}
	}
	
}