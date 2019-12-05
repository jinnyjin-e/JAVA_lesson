import java.util.Scanner;

/*
String [] args은 args라는 배열 이라는 뜻이었따!

class 클래스명 뒤의 공백이 args 배열의 성분을 나타냄
??무슨말이지...
*/
class Arggg{
	public static void main(String [] args){
//		System.out.print("배열 으아ㄹ그s의 배열은"+args[0]+"\n");
		/*java Arggg 치고 엔터! 가 아니라
		java Arggg (배열) (배열) (배열) 의 형태로 입력!
			Ex) javac Arggg.java 
				java Arggg 4 12 8 
				와 같이 입력
		*/
		
//		System.out.print("커맨드 라인의 두 정수의 합"+args[0]+" "+args[1]);//이렇게하면 합이 안나옴
		// 커맨드 라인(명령행-커서 깜빡이는 부분)
		
		if(args.length<2){
		System.out.print("사용법: 정수1 정수2");
		return;
		}
		
		System.out.print("커맨드 라인의 두 정수의 합"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		//args[a]는 값 그 자체가 아니라 주소이다(String 이기 때문에)
		//정수로 바꾸기 위해 함수"Integer.parseInt(~~~)"를 사용해준다
		//Double.parseDouble[0]이라고 하면 실수형으로 저장해줌
		
	}
}