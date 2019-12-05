// 예외처리를 위한 예제 -try사용		//7번
import java.util.Scanner;

class Div{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,b;
		System.out.print("a: ");
		a = ms.nextInt();
		System.out.print("b: ");
		b = ms.nextInt();
		
//		try{
		System.out.println(a/b);
		//cmd창에서 10 0 으로 입력하면 예외발생- try 이용하여 직접 해결
//		}catch(ArithmeticException ae){
//			System.out.println("b는 0일수 없습니다.");
//		}
		
		
		System.out.println("프로그램은 계속 실행됩니다.");
		//예외처리를 안해주면 위의 출력이 안나온다.(강제종료 되어서)
		
		//throws를 통해 종료를 
	}
}