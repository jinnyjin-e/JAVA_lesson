
//사용자로부터 -10부터 10 사이의 예측값(정수)를 입력받음
//-10에서 10까지 난수 생성
//사용자가 예측성공하면 합격! 못하면 불합격! 출력

import java.util.Scanner;

class RanTest{
	public static void main(String [] args){
		// 0이상 1미만의 실수형 랜덤넘버 생성
		int a,b;
		double ran;
		Scanner ms = new Scanner(System.in);
		
		ran = Math.random();
		
		System.out.println("예측값을 입력하세요");
		b = ms.nextInt();
		System.out.println("랜덤값은"+(int)(ran*21-10));
		a = (int)(ran*21-10);
		System.out.println(a==b?"합격!":"불합격!");
		if (user 
		
		ran = Math.random();
		System.out.println(ran);
		//1)0 이상 10 미만의 실수형 랜덤넘버 생성
		//2)0 이상 10 이하의 정수형 랜덤넘버 생성
		//3)25이상 60 이하의 정수형 랜덤넘버 생성
		
		//1)
		System.out.println(ran*10);
		System.out.println((int)(ran*10));

		
		//2)10이하가 되기 위해서는 11을 곱하여 10.999까지 범위가 되도록 해야된다.
		System.out.println((int)(ran*11));

		//3) 25이상 60 이하가 되기 위해서는 곱하기36 후에 25를 더해주면 25이상 61미만(60이하)	
		System.out.println((int)(ran*36+25));		
		
		
	}
}