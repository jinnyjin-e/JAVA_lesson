import java.util.Scanner;
//배열 : 같은 자료형의 자료를 여러개 저장 할 수 있는 자료형
class Arrray{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
	//	int a;		//int의 a에는 정수 1개 저장가능
	//	int a[100] 	//"C에서" 100개의 int를 저장 할 수 있는 배열임
		int [] a = new int[100];
		//int형의 배열, 왼쪽의 []안에 숫자 ㄴㄴ임
		//'int [] ' 자체가 하나의 자료형 느낌
		
		//실수 5개를 저장 할 수 있는 배열 b
		double [] b = new double[5];
		
		//문자열 10개를 저장 할 수 있는 배열 c;
		String [] c = new String[10];
		
		//실수 5개를 넣을 수 있는 공간을 지정하는 주소 5개 확보
		//문자열 10개를 넣을 수 있는 공간을 지정하는 주소 10개 확보
		//==> 배열은 참조자료형!
		
		int [] d ={1,3,5,4,2,9};
		//공간이 아니라 값들을 바로 넣을수도 있음 ㅇㅇㅇㅇ
		//	d[0]은 값이 1 // d[1]은 값이 3 // d[5]는 값이 9이다
		
		System.out.println("배열 a의 원소갯수 : "+a.length);
		System.out.println("배열 a의 원소갯수 : "+d.length);
		//배열명.length 의 함수 사용 시 배열의 길이 나옴 -> 얘는 괄호 안씀!
		
		/*배열 d의 모든 원소들 출력
		for(int i = 0; i<=d.length;i++)
			System.out.printf("%d ",d[i]);
		*/
		
		
	//for-each문
		/*for((배열의)자료형 변수명 : 배열명){
			
			 
		}
				의 형태를 가짐*/
		
		
		//d의 모든 성분을 x에 차례대로 대입시킴
	/*	for(int x : d){//d=1 3 5 4 2 9
			x*=10;
			System.out.print(x+", ");
		}
		/ 장정 : 범위를 안 적어서 편하다
		/ 단점 : 배열 성분 변경은 불가하다(x값 말고 d가 변경되는거 X)
		/		 for-each 내에서 x*10 와 같은 식으로 변경하면 x가 바뀌는거
		/		 for each 밖에서는 d는 그대로임 ㅇㅇㅇㅇ
		*/
		
		for(int i=0;i<d.length;i++){//d=1 3 5 4 2 9
			System.out.print(10*d[i]+", ");
		}
		// 위의 print 출력결과에 ,가 남아있음 : \b를 통해 제거가능
		System.out.print("\b\b \n");
		
		/* 	\b는 커서를 이동 시키는것 \b\b는 커서 왼쪽으로 2칸 이동
			\b뒤의 문자로 해당 커서 위치를 덮어씀
			"\b "로 표현하면 해당 위치를 " "(빈칸)으로 덮어쓴다는 뜻  */
			
		//오름차순 정렬
		int tmp; 		
		for(int i=0;i<(d.length-1);i++){
			for(int j=i+1;j<d.length;j++){//j 선언 할 때 1부터가 아니라 i+1부터 !!!!!
				if(d[i]>d[j]){				//부등호를 <로 해주면 내림차순!!!!
					tmp=d[i];
					d[i]=d[j];
					d[j]=tmp;
				}
			}
		}
		for(int i=0;i<d.length;i++){//d=1 2 3 4 5 9 //오름정렬 된 상태
			System.out.print(d[i]+", ");
		}
		System.out.print("\b\b \n");
		
	}
}






