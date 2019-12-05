import java.util.Scanner;

class OperatorTest{
	public static void main(String [] args){
		System.out.println("1+2 = "+1+2);
		//+가 연결의 의미로 사용되었기 때문에 12가 출력된다: 연결+와 덧셈+ 중 연결+가 먼저 나오면 그 이후는 전부 연결+로 인식
		System.out.println(1+2+"=1+2");// 이런식이면 3 = 1+2 가 출력된다 덧셈+를 먼저 사용하고 연결 +사용
		System.out.println("1+2 = "+(1+2));// 로 표현하면 덧셈+를 먼저하기 때문에 1+2=3 출력된다
	//	System.out.println(5/0); //'예외' 발생 ->컴파일 에러랑 다름! 컴파일은 되는데 결과가 안 나오는 것
		System.out.println(5.0/0); //의 경우예외x why?)실수형에서는 0을 0이 아니라 0에 가까운 작은수로 취급->infinity 나옴
		System.out.println(0.0/0.0); //의 경우 infinity도 아님! NaN : Not a Number 출력
		
		//정수형으로 화씨온도를 입력받고 섭씨,화씨로 출력 해보자!
		Scanner ms = new Scanner(System.in);
		int temp;
		
		System.out.print("온도 입력 : ");
		temp = ms.nextInt();//41도 입력
		
	//	나누기 연산!	
		System.out.println("화씨온도는 : "+temp);
		System.out.println("섭씨온도는 : "+((double)5/9*(temp-32)));
		// [5/9*((double)temp-32)]로 하면 5/9가 0으로 취급되어서 double을 앞에 써줘야 한다.
		
		
		
	}
}