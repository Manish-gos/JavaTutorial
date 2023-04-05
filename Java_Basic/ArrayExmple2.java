package Java_Basic;
class ArrayExmple2{
	public static void main(String [] args){	
		
	char[] s= {'M','R','u','a','c'};
	String str=new String(s);
	System.out.println(str);
	
	 str="ruchi is a lazy girl and rarely take bath";
	System.out.println(str.replace("r",""));
	
	String s1[]=str.split(" ");
	for(int i=0;i<s1.length;i++){
		System.out.println(s1[i]);
		}
	}
}