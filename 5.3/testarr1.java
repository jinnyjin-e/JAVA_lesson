import java.util.*;
/*
import java.util.Scanner;
import java.util.Random;
�̷��� 2�� import����� �Ǵµ� .util.*; �Ƕ��� java.util�� ��� ������ import�Ѵٴ� ��
*/
class testarr1{
	public static void main(String[] args){
		Scanner ms = new Scanner(System.in);
		int d;
		double [] arr;
		
		System.out.print("�迭�� ���� ����");
		d=ms.nextInt();
		arr = new double [d];
		
		System.out.print("�迭���� �ʱ�ȭ");
		initArr(arr);
		printArr(arr);
		
		
	}
	static double initArr(double [] arr){
		int x;
		x = 9*(int)Math.random();
		double [] arr = new double [x];
		return arr;//��� Ʋ�� ������
	}
	static void printArr(double [] arr){
		for(double x:arr)
			System.out.printf("%.1f ",x);
		return;
	}
	static double sumArr(double [] arr){
		double sum=0;
		for(double x:arr)
			sum +=x;
		return sum;
	}
	static double maxArr(double [] arr){
		double mx=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>mx)
				mx=arr[i];
		}
		return mx;
	}
	static double indexMaxArr(double [] arr){
		double tmp=0;
		int indx=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>tmp){
				tmp=arr[i];
				indx = i;
			}
		}
		return indx;	
	}
	
	static void shuffleArr(double [] arr){
		Random r = new Random();
		int rNbr;
		double tmp;
		
		for(int i=0; i<arr.length; i++){
			rNbr = r.nextInt(arr.length);
			//���� ������ ������ 0 ~ (arr�� ����-1)�� ������
			tmp = arr[i]; 
			arr[i] = arr[rNbr];
			arr[rNbr] = tmp;
		}
		
		return;//��� ����
	}

}