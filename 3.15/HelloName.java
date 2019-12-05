//사용자로부터 이름을 입력받아 그대로 출력하기!!
import java.util.Scanner; //javj.util : 패키지(폴더랑 비슷한 개념) 자바폴더->유틸폴더 안의 스캐너 명령어?를 사용하겠다는 뜻 

class HelloName{
	public static void main(String [] args){//String 첫글자가 대문자->클래스명 임!
		/*Scanner	myScanner; //<-스캐너 선언
		        한번에 선언하려면 : Scanner myScanner = new Scanner(System.in);
		myScanner = new Scanner(System.in);// 키보드로 부터 데이터를 스캔하는 스캐너 생성
		
		System.in : 표준입력 = 키보드*/
		
		Scanner myScanner = new Scanner(System.in);
		String name; //문자열
		int age;
		// 이름을(스캐너를 통해 입력받은 정보를) 저장할 공간 확보하기 = 이름변수 선언(자료형 변수명;)
		
		System.out.print("나이 : ");
		age = myScanner.nextInt();//여기서 nextline이 아니므로 나이 입력 후 버퍼가 남아있음
		
		myScanner.nextLine(); //버퍼에 남은 엔터만 없애기 위한것 만약 없애지 않는다면 아래의 nextline때문에 입력 없이 공백이 바로 출력됨
								//다른곳에서 nextline을 쓰는 경우에만 버퍼를 없애기 위하여 사용하면된다 ㅇㅇ
		System.out.print("이름 : ");
		name = myScanner.nextLine();// next는 공백 부분 전까지만 입력받고 nextline은 그 줄 전체를 입력받는다(엔터포함)
		//name = myScanner.next();// 공백 전까지 받기 때문에 홍 길동 이라고 입력시 next는 홍 까지만 입력되고 이후에 있을 next함수에 길동이 자동으로 넘어감
		
		//System.out.print("나의 이름은"+name+"이다");
		System.out.format("당신의 이름은 \"%10s\" 입니다. \n",name); //%s 사이에 숫자 입력 시 해당숫자만큼 자리수 확보함->글자가 없는 자리만큼 공백이 생김
																//숫자 앞에 마이너스 입력 시 좌측정렬 (%-10s)
		System.out.printf("당신의 나이는 %d(%1$#o, %1$#x)세 입니다.",age,age,age);/*%d:10진수, %o:8진수, %x:16진수,
								#을 넣으면 8진수는0,16진수는0x가 출력됨, %x에서 대문자 %X로 하면 출력도 대문자로 출력됨 
								1$는 첫번째 인자(위의 경우 name)를 사용하겠다는 뜻 1대신 다른숫자 사용시 그 순서의 인자사용
								+를 넣어준다면 부호표시를 해줌 ex) %+d, %1$+d  와 같이 사용가능  단, 10진수만 부호가능
								공간확보까지 쓴다면 %1$-+10d, %1$#-5x 같은 순서로 하면 된다*/
		
		
	}
}