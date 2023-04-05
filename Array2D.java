class Array2D{
	public static void main(String[] args){
		int [][] arr={{1,2},{2,3},{3,4},{4,5}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		int k=0;
		int [][] ar=new int [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				ar[i][j]=k;
				k++;
			}
		}
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[0].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}