import java.util.Scanner;

class ipumoon{
	public static void main(String [] args){
		int a;
		String jong;
		
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("몇종? : ");
		jong = ms.nextLine();
		System.out.print("몇점? : ");
		a = ms.nextInt();
		
		/* == :동등한지 비교하는것
		jong에는 2종이라는 문자열의 '주소'가 들어가있다.... 그래서 처음에 오류뜸ㅠ
				/기초자료형은 내용비교 가능(직접적으로 내용을 저장하기 때문에)
				하지만 String과 같은 참조자료형은 주소값을 저장하기 때문에 직접적으로 비교불가능
		if(jong == "1종")라고 하면 주소를 비교하게 된다.... 
		
		equals() 라는 함수를 통하여 비교가능! -> jong.equals("1종") <=이런식으로 표현 :jong이 "1종"이라는 문자와 같은지 확인
				아래처럼 "2종".equals(jong) <- 이렇게도 표현가능 : "2종"이 jong과 같은지 확인
		출력값은True/False값 출력된다.
		*/ 
		
	/*
		if(jong.equals("1종")){ //(if(jong.equals("1종")== True) 라고 할것없이 참이면 실행이므로 저렇게 놔둠
			if(a>=60) System.out.println("\t=> 합격");
			else System.out.println("\t=>불합격");
				
		}
		else if("2종".equals(jong)){//2번째 방법
			if(a>=70) System.out.println("\t=> 합격");
			else System.out.println("\t=>불합격");
		}
		else System.out.println("\t=>[입력오류] 그런종은 없습니다.");
		
	*/
		switch(jong){
			case "1종":
				if(a>=60) System.out.println("\t=> 합격");
				else System.out.println("\t=>불합격");
				break;
			
			case "2종":
				if(a>=70) System.out.println("\t=> 합격");
				else System.out.println("\t=>불합격");
				break;
			
			default:
				System.out.println("\t=>[입력오류] 그런종은 없습니다.");
		}
		

	}
}