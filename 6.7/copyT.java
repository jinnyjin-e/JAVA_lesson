/*							//4번
	파일 복사 프로그램
		CMD -> java copyTest원본파일 복사본파일
	1.커맨드라인에서 원본파일 복사본파일명을 받는다
	2.커맨드라인에인자 2개가 입력되지 않는다면 사용법 알리고 프로그램 종료
	3.원본파일이 없다면 프로그램 종류
	4.복사본파일이 이미 존재한다면 이를 알리고(복사하지않고) 프로그램 종료
	5.원본파일을 복사하여 복사본에 저장하고 콘솔창에 복사완료라고 출력하기
	
*/
//String 클래스 매소드랑 연결되서 나온다고함 시험에


import java.util.*;
import java.io.*;

class copyT{
	public static void main(String [] args)throws Exception{
		
		File f1 = new File(args[0]);//원본
		File f2 = new File(args[1]);//복사본
		
		if(args.length<2){
			System.out.print("[오류] 사용법: 원본파일 복사본파일");
			return;
		}
		if(f1.exists()==false){
			System.out.print("[오류] 원본파일 존재하지 않음");
			return;
		}
		if(f2.exists()==true){
			System.out.print("[오류] 이미 복사본 파일 존재");
			return;
		}
		
		Scanner ms = new Scanner(f1);//원본에서 불러옴
		PrintWriter pw = new PrintWriter(f2);//복사본에 씀
				
		
		while(ms.hasNext()==true){
			//pw.printf(ms.nextLine()+"\r\n"); 라고 하면 원래 되어야 하는데 안되는 경우 아래처럼 해줘야 한다
			pw.printf("%s \r\n",ms.nextLine());
		}
			
		pw.close();
		ms.close();//스캐너도 닫으면 좋음
		
		System.out.print("복사완료!");
	}
}