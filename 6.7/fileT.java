/*파일: (자바에서는 파일도 하나의 객체로 본다)*/ // 1번
import java.io.*;//파일 입출력 할 때에는 java.io 패키지를 모두 임포트
class fileT{
	public static void main(String [] args){
		//같은 폴더 안에 있는 eatTest에 접급하고 싶음 -> eatTest라는 파일을 객체로 만들어둬야한다
		File f1 = new File("eatTest.java");//같은 폴더안에 있으면 상대경로(파일명만 적는 것)로 접근가능
		File f2 = new File("D:\\금요일\\6.7\\eatTest.java");//절대경로 "D:\금요일\6.7"는 eatTest 파일이 있는 폴더주소(위치)
														//  그런데 \ 는 제어문자이므로 \\ 처럼 \를 두개 사용하여야 한다.
		File f3 = new File("ABC\\def.java"); //파일테스트가 있는 폴더(6.7)안의 폴더(ABC)에 있는 파일을 호출 할 때(하위폴더 호출)
		File f4 = new File("ABC"+File.separator+"abc.java"); // abc라는 자바파일는 없음
		
		// 윈도에선 파일주소를 표현 할 때 \\ 로 하지만 리눅스에선 / 라고함->플랫폼에 독립적이기 때문에 공통적으로 사용가능한 것이 필요하다
		// '/' 대신에 File.separator 를 사용하면 ㄱㄴ ㄱㄴ ㅆㄱㄴ : 하위폴더를
		// separator 얘는 static 필드 이다 ㅇㅇㅇ
		
		
		System.out.println("f1파일이 실제로 존재하는가? "+f1.exists());
		System.out.println("f4파일이 실제로 존재하는가? "+f4.exists());
		// exists() : 파일 또는 폴더가 실제로 존재하는지에 대한 함수 
		
		System.out.println("f2파일이 이름은? "+f2.getName());
		System.out.println("f2파일이 이름은? "+f3.getName());
		// getName() : 파일 이름을 알아낼 때 사용
		
		System.out.println("f2 가 상대경로인가? 궁금ㅋ"+f2.isAbsolute());//상대경로임 -> 트루
		System.out.println("f3 가 절대경로인가? 궁금ㅋ"+f3.isAbsolute());//절대경로임 -> false
		System.out.println("f3 가 절대경로인가? 궁금ㅋ"+f3.getAbsolutePath());//절대경로 주소
		// 이건 별로 안중요함
		
		System.out.println("f3의... 어..."+f3.isDirectory());//아 이건 못들음 근데 별로 중요X
		
		System.out.println("f3의 최종 수정일"+f3.lastModified());//날짜이긴 한데 우리가 아는 yy/mm/dd 형식이 아님
		System.out.println("f3의 최종 수정일"+new java.util.Date(f3.lastModified()));//print내부에서 import가능!! / 이렇게 하면 우리가 아는 날짜형식으로 나옴
		
	}
}	