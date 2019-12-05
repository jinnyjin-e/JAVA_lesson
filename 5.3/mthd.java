class mthd{
	public static void main(String [] args){//<- main이라는 함수 이름: main은 인자로 문자열의 배열로 받음
						//매소드는 클래스 안에 저장해야 된다.
	/*			↓결과값의 자료형
헤더->	static ㅁㅁㅁㅁㅁ 메소드이름 (){
바디->	
  할일들→	[함수를 실행하려면 '호출'해야한다:함수이름(인자들)]
		return 결과값;-> return value : 반환값; ?? 뭔소리?
		}
	*/	
		
		System.out.println(Math.cos(Math.PI));  //cos(파이)호출해보기
  		System.out.println(sum(1,5,9));  //1+5+9 호출해보기
		System.out.println(div(9,5));
		double [] arr = { 1,2,3,4.5}
		summarr(arr);
								//여기서 20번째줄로 가서 sum 함수를 사용
	}
	//실수형 배열을 매개변수로 받아 모든 성분의 합을 "출력"하는 메소드를 작성하고 테스트
	static void sumarr(double [] a){
//			↑반환하는 반환값/반환값의 자료형 을 모르기때문에
		double sum=0;
		for(double x : a){
			sum+=x;
		}
		System.out.printf("모든 성분들의 합: %.1f \n",sum);//출력임,반환과 다름
		return; //얘는 없어도 된다.
	}
	
	//두 정수를 매개변수로 받아 앞의 수를 뒤의 수로 나눈 결과를 "반환"하는 메소드를 작성하고 테스트
	static double div(int a, int b){
		return a/(double)b;
	}
	
	//세 정수를 매개 변수로 받아 세 수의 합을 반환하는 메소드를 작성하고 테스트
	static int sum(int a, int b, int c){
		  //↑ int : 결과값의 자료형
		return a+b+c;//12째줄로 다시 돌아감
		
	}
	
	
}