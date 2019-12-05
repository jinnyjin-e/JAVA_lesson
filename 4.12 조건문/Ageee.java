import java.util.Scanner;

class Ageee{
	public static void main(String [] args){
		int age;
		Scanner ms =new Scanner(System.in);

//조건문ver.1		
		/*System.out.printf("나이: ");
		age = ms.nextInt();
		//같은 문장이 반복되는것을 피하기 위해 do while문 사용
		
		while(age<0||age>200){
			if(age<00||age>200) System.out.printf("[입력오류]\n");
			System.out.printf("나이: ");
			age = ms.nextInt();
			
		}
		System.out.printf("당신의 나이는 %d 입니다.",age);
		*/
		
		/*
		do while문 은 아래와 같이 ㄴ타낼수있음
		do while은 최소1번 반복(실행), 그냥 while은 최소 0번 실행!!
		
	do{
		반복할 내용
	}while(조건); 		<- 세미콜론 필수임!
		*/
//조건문ver.2
		/*do{
		System.out.printf("나이: ");
		age = ms.nextInt();
		if(age<00||age>200) System.out.printf("[입력오류]\n");
		}while((age<00||age>200));
		*/
		
//조건문ver.3
		/*무한반복 사용방법 : while(True){내용} 의 방법을 통해 무한반복 가능
		특정 조건을 만족하면 반복문 탈출 해야된다.*/
		
		while{
		System.out.printf("나이: ");
		age = ms.nextInt();
		if(age<00||age>200) break; //탈출조건
		System.out.printf("[입력오류]\n");
		}
		
	}
}






