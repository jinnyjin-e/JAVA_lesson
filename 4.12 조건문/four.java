import java.util.Scanner;
/*
		for문
		for(변수 선언,초기화;반복조건;증감문){
			반복할 내용	
		}
*/
class four{
	public static void main(String [] args){
		
		/*for(;;){//무한반복임-> while(true)와 같음. 대신 세미콜론 두개는 무조건 있어야 된다. 프로그램(반복) 종료 시 ctrl+C
			System.out.println("Hello, world!");
		}
		*/
		for(int i=0;i<5;i++){
			System.out.print("Hello, world!\n");
		}
		// int i가 for 안에서 선언된거면 for밖에서 i가 선언된 상태가 아님
		// 만약 for 밖에서 i를 선언하고 for 완료하면 밖에서 i=5의 상태로 사용가능
		
	/*	for(int i=1;i<11;i++){
			System.out.print(i+"\n");
		}
	*/	
		for(int i=11;i<128;i+=4){//i+=4로 표현가능
			System.out.print(i+" ");
			//print(4*i+7);로 출력하고 i=1로 초기화, 증감문에 i++사용해도 된다.
			
		}
		for(int i=127;i>=11;i-=4){//i=i-4라는 뜻
			System.out.print(i+" ");
			//print(4*i+7);로 출력하고 i=1로 초기화, 증감문에 i++사용해도 된다.
			
		}
		
	}
}