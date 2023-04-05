package Java_Basic;
class StringExample{
	public static void main(String [] args){
	// String - String is a sequence of characters,its a non premitiv data type in java
	String s="Manish";

	System.out.println(s);
	// to find the length of string
	int len=s.length();
	System.out.println(len);
	// select char form any index
	//	char r =sc.next().charAt(0); try to understand the logic of user input for char
	char c=s.charAt(0);
	System.out.println(c);
	// substring is a part of string
	String sub=s.substring(0,3);
	System.out.println(sub);
	String sub1=s.substring(3);
	System.out.println(sub1);
	// convert into upper case
	System.out.println(s.toUpperCase());
	// convert into lower case
	System.out.println(s.toLowerCase());
	//concat opration
	System.out.println(s.concat(" Goswami"));
	String str=s+" Goswami"+ " lives in Karhi";
	System.out.println(str);
	//replace the value
	System.out.println(str.replace("a","e"));
	// index of first char
	System.out.println(str.indexOf("i"));
	str="      "+str+"    ";
	System.out.println(str);
	// remove extra spaces
	System.out.println(str.trim());
	// convert datatypes into String
	String conv=String.valueOf(12);
	System.out.println(conv);
	System.out.println(String.valueOf(120.00));
	System.out.println(String.valueOf(true));
	}
}