//자바언어
class HelloWorld{//클래스명 관습정으로 대문자 사용, 보통 class 앞에 public 씀
					//클래스명과 파일명 같게 해줄것 특히 public쓰면
	public static void main(String [] args){
			//소괄호 안에 무조건 적어줘야 함/첫글자 대문자 쓸 것/args:배열명
		int age=21;
		System.out.print("이름 : 서진 "+age+"세\n");//println에서 줄바뀜이 없음
		System.out.println("학번 : 2015111602");//줄이 자동으로 바뀜 : 자동개행
		System.out.format("Hello World!! 나이 : %d \n",age); //format은 printf와 유사한것
		System.out.printf("Hello World!!"+"12");
			//모니터에게 printf 해달라는 뜻 : 모니터.printf
			//System.out : 모니터 = 표준출력장치
			// printf를 위해 헤더 추가할 필요 없음
			
			//%d 와 같은 것들:: format specifier :서식지정자 라고 함
			//format과 printf와 같이 f가 붙은 것들만 %어쩌고 사용가능->print는 불가
			//print에서는 +age를 붙이면 된다
	}
	
}
 
//시험: 이론부분 및
//전화번호 출력하는 프밍? 하기 ㅎㅎ


/*
c언어

#include<stdio.h>

void main(){
	printf("Hello world!");
}
*/