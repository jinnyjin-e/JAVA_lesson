import java.util.*;
/*
import java.util.Scanner;
import java.util.Random;
이렇게 2개 import해줘야 되는데 .util.*; 의뜻은 java.util의 모든 폴더를 import한다는 뜻
*/
class testarr1{
	public static void main(String[] args){
		Scanner ms = new Scanner(System.in);
		int d;
		double [] arr;
		
		System.out.print("배열의 원소 갯수");
		d=ms.nextInt();
		arr = new double [d];
		
		System.out.print("배열성분 초기화");
		initArr(arr);
		printArr(arr);
		
		
	}
	static double initArr(double [] arr){
		int x;
		x = 9*(int)Math.random();
		double [] arr = new double [x];
		return arr;//요거 틀린 문장임
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
			//랜덤 정수의 범위를 0 ~ (arr의 길이-1)로 정해줌
			tmp = arr[i]; 
			arr[i] = arr[rNbr];
			arr[rNbr] = tmp;
		}
		
		return;//없어도 무방
	}

}