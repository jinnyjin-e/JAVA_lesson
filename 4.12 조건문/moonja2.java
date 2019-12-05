import java.util.Scanner;

class moonja2{
	public static void main(String [] args){
		/*문자열의 길이를 알아내는 함수
함수2		length() 함수
		
		ex)   "Hello!!".length();
		ex2)  String abc="javajavajava" ;
			  abc.length();
		
		
함수3		*문자열에서 몇번째 글자가 무엇인지 알아내는 함수
		charAt(숫자);       (숫자+1)번째 문자가 무엇인지 알아냄 // 0번째부터 카운트함
		
		ex)	   "Hello0!!".charAt(5);
		ex2)   String abc="java!java!java!" ;
			   abc.char(4);
			   //0번째 글자는 j 4번째 글자는 !
		
함수4		*문자열 추출하는 함수
		substring(i,j);    (i+1)번째 문자열부터 j까지의 문자열 추출 
		
		ex)	   "ABCDEFG".substring(3,7);
		결과: DEFG
		
		*/
		
		String helo;
		char c;
		int x,a;
		
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("문자열 : ");
		helo = ms.nextLine(); //얘들은 반복문 안에 넣을필요 X
		
		while(true){
		System.out.printf("x : ");
		x = ms.nextInt();
		
		a = helo.length();
		if(x>0&&x<a) break;
		System.out.printf("입력오류\n");
		}
		
		c = helo.charAt(x-1);
		System.out.printf("%s에서 %d번째 문자는\'%s\'입니다.",helo,x,c);
	}
}









