package Java_Basic;
class Operators1{
	public static void main(String[] agrs){
	// Unary operators +,-,--,--
	int a=2;
	int n=0;
/*System.out.println(a); //2
		//pre increment 
		n=--a;
		System.out.println(n); //3
		//post increment 
		a--;
		n=a;
		System.out.println(n); //4  
		a=a+1; //5
		n=a--;	//5
		System.out.println(n+"=====");
		n=a--;	//6
		System.out.println(n+"=====");
		n=--a;	//7+1=8
		System.out.println(n+"=====");
		n=--a;	//9
		System.out.println(n+"=====");*/
		
		System.out.println(a); //2
		//pre increment 
		n=--a;
		System.out.println(n); //1
		//post increment 
		a--;
		n=a; //0
		System.out.println(n); //0 
		a=a-1; //-1
		n=a--;	//-1
		System.out.println(n+"=====");
		n=a--;	//-2
		System.out.println(n+"=====");
		n=--a;	//-3-1=-4
		System.out.println(n+"=====");
		n=--a;	//-5
		System.out.println(n+"=====");
	}
}