import java.util.Scanner;
//Scanner,String,System,Math는 내가 작성한 클래스가 아님 남의 클래스이다.->Scanner만 import했음
//java.lang. 패키지에 존재하는 클래스는 import 하지 않아도 사용가능하다.
/* ->java.lang.String
	 java.lang.System
	 java.lang.Math  <-구글링하면 어떤 것들을 지원하는지 알 수 있음 ex)찾은결과 Math.E 는 무리수 e임
	위의 것들이 lang 패키지에 존재함 ㅇㅇㅇ
*/
class one{
	public static void main(String [] args){
		double a;
		Scanner ms = new Scanner(System.in);

		System.out.print("원 반지름 입력 ㄱㄱ:");
		a = ms.nextDouble();
		
		/*System.out.println("원의 둘레 : "+2*Math.PI*a);//원주율은 Math 클래스에서 제공함
		System.out.println("원의 넓이 : "+Math.PI*a*a);*/
		
		System.out.println("원의 둘레 : "+2*Math.PI*a);//원주율은 Math 클래스에서 제공함
		System.out.println("원의 넓이 : "+Math.PI*Math.pow(a,2));//pow 함수:제곱함수->pow(밑,지수)
		System.out.printf("cos(0) 값 : "+Math.cos(0));//cos/sin 함수
		System.out.printf("\nsin(π) 값 : "+Math.sin(Math.PI));//π기호: ㅎ입력된 상태에서 한자 키 누름 
		//sin 출력값이 0 이 아닌 1.22XXXXE-16 이런식으로 나옴 -> 값이
		System.out.printf("\nsin(π) 값 : %.4f\n",Math.sin(Math.PI));
		// 이렇게 하면 출력값 0.0000이 나옴
	
	}
}