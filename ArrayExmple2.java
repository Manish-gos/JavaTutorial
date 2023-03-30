class ArrayExmple2{
	public static void main(String [] args){	
		
	char[] s= {'M','R','u','a','c'};
	String str=new String(s);
	System.out.println(str);
	
	String str="ruchi is a lazy girl and rarely take bath";
	System.out.println(str.replace("r",""));
	
	String s[]=str.split(" ");
	for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
		}
	}
}