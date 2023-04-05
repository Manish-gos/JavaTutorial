package Java_Basic;
/* You have given a string print all the repeating characters of the string */

import java.util.*;
class String2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++){
			
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
						if(str.contains(s.charAt(i)+"")){
							break;
						}
				str+=s.charAt(i);
				}
			}
		}
		System.out.println(str);
	}
}