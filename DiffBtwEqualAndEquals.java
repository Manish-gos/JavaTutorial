class DiffBtwEqualAndEquals{
	public static void main(String [] args){
		/*String a="Man";
		String b="Man";
		System.out.println(a==b);
		System.out.println(a.equals(b));*/
		
		// string litral
		String s="Manish";
		String s1="Manish";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		s1="Manish Goswami";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		
		/*// using string object
		String str=new String("Ruchi");
		System.out.println(s);
		System.out.println(str);*/
		
		String str=new String("Manish");
		
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		
		System.out.println(s==str);
		System.out.println(s.equals(str));
		
	}
}