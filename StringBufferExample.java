//String Buffer 
class StringBufferExample{
	public static void main(String [] args)
	{
		StringBuffer sb=new StringBuffer("Sachin");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("Tendulkar");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		StringBuffer sb1=new StringBuffer("Sachin");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		String s="Manish";
		System.out.println(s);
		System.out.println(s.hashCode());
		s=s.concat("Goswami");
		System.out.println(s);
		System.out.println(s.hashCode());
		String s1="Manish";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		
		
	}
}
	
