class Arrr{
	public static void main(String [] args){
		double [] arr = {1.1,2.3,4.5,6.8};
		for(int i = 0; i<arr.length;i++ )
			System.out.printf("%.1f  ",arr[i]);
		
		System.out.printf("\n");
		
//		for each��
		for (double x:arr)
			System.out.print(x);
		System.out.printf("\n");
		
//�߰����˹���	
//1��	int [] inin = new int[100];
/*8��		int arr1 = {1,2,3,4};
		int arr2 =  new int[4];
		for(int i = 0; i<arr.length;i++ )
			arr2[i] = arr1[i];
		*/
		
		
		//2���� �迭
		//               (���� ��)��  ��(���� ��)
	    int [][] abc = new int [3][5];
		//abc.length �� ��� ���� �����̹Ƿ� 3�̵ȴ�.
		//����?? -> abc[0].length ����ϸ� 0������ �� ����.	    ________________
													// | 1 | 2 | 3 | 4 |
		int [][] arr2 = {{1,2,3,4},{5,6,7,8}};		// | 5 | 6 | 7 | 8 |�� ���·� ����ȴ�.
		for(int i = 0;i<arr2.length;i++){
			for(int j = 0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"   ");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		
		//2���� �迭 for each������ ���
		for(int[] row:arr2){
			for(int x : row){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}
}