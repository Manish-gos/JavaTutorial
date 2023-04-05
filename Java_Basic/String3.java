package Java_Basic;
// anagram sit its
class String3{
	public static String order(String s){
		String str="";
		String s1="";
		for(int i=0;i<s.length();i++){
			char minc=s.charAt(i);
			for(int j=i+1;j<s.length();j++){
				if(minc>s.charAt(j)){
					minc=s.charAt(j);
				}
			}
			str+=minc;
		}
		return str;
	}
	
	public static void main(String [] args){
	String s="sitt";
	String st="iits";
	System.out.println(order(s));
	 
	}
}