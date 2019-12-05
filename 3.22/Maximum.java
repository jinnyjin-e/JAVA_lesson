//사용자로부터 두 정수를 입력받아 최댓값 출력하기
import java.util.Scanner;
class Maximum{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		
		int a, b ;
		
		System.out.print("두 정수 입력: ");
		a = ms.nextInt();
		b = ms.nextInt();
		
		System.out.printf("더 큰 수는 "+(a>b?a:b));
		//(a>b?a:b) 피연산자들의 합인 '수식'임 이라고 말씀하심 교수님이
		
		int max;
		max = a>b?a:b ;
		System.out.printf("\nMax : "+max);
		//라고 표현해도 가능 
		
		String s;
		s = (max==a)?"최대는 앞의 수 입니다":"최대는 뒤의 수 입니다";
		s = (a==b)? "두 수는 동일합니다":s;
		
		System.out.printf("\n입력한 두 수는, %d, %d이며, %s \n",a,b,s);
		
	}
}