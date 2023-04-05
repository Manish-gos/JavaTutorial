package Java_Basic;
// Array is a container which is used to hold similar datatype value in contigius manner.
import java.util.*;
class ArrayExmple{
	public static void main(String [] args){
		// datatype variable name [] ={......}
		Scanner sc =new Scanner(System.in);
		/*int arr[]={1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		// datatype variable name [] =new datatype[size of array]
		int arr1[]=new int[5];
		
		// here array will be initialixzed with default values as per datatype
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++){
			
			System.out.print(arr1[i]+" ");
		}
		
	}
}