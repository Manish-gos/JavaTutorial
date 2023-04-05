class Array2{
	public static void main(String [] args){
	 int [] arr= {1,3,4,52,9,7,5,4,6};
	 for(int i=0;i<arr.length;i++){
	  for(int j=i+1;j<arr.length;j++){
			int a=arr[i];
			if(arr[i]>arr[j]){
				arr[i]=arr[j];
				arr[j]=a;
			}
	  }
	 }
	
		 System.out.print(arr[0]+" "+arr[arr.length-1]);
	}
}