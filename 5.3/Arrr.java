class Arrr{
	public static void main(String [] args){
		double [] arr = {1.1,2.3,4.5,6.8};
		for(int i = 0; i<arr.length;i++ )
			System.out.printf("%.1f  ",arr[i]);
		
		System.out.printf("\n");
		
//		for each문
		for (double x:arr)
			System.out.print(x);
		System.out.printf("\n");
		
//중간점검문제	
//1번	int [] inin = new int[100];
/*8번		int arr1 = {1,2,3,4};
		int arr2 =  new int[4];
		for(int i = 0; i<arr.length;i++ )
			arr2[i] = arr1[i];
		*/
		
		
		//2차원 배열
		//               (세로 수)행  열(가로 수)
	    int [][] abc = new int [3][5];
		//abc.length 의 경우 행의 길이이므로 3이된다.
		//열은?? -> abc[0].length 라고하면 0번행의 열 길이.	    ________________
													// | 1 | 2 | 3 | 4 |
		int [][] arr2 = {{1,2,3,4},{5,6,7,8}};		// | 5 | 6 | 7 | 8 |의 형태로 저장된다.
		for(int i = 0;i<arr2.length;i++){
			for(int j = 0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"   ");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		
		//2차원 배열 for each문으로 출력
		for(int[] row:arr2){
			for(int x : row){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}
}