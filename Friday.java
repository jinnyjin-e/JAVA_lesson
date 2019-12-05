//사용자로부터 x를 입력받아 x일 뒤의 요일을 출력하는 풔굄 작성
/* 오늘은 금요일
	ex) 며칠 뒤 : 1 이라고 입력 시
	1일뒤는 6요일 입니다
	
	를 출력하기 ( 월요일 =1요일, 화요일=2요일 ...... 일요일=0요일);
*/
import java.util.Scanner;

class Friday{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in); 
		int day, a;
		
		System.out.println("오늘은 금요일 입니다 ");
		System.out.printf("며칠 뒤 : ");
		day = ms.nextInt();
		
		System.out.printf("%d일 뒤는 %d요일 입니다.\n",day,(day+5)%7);

		
	}
}