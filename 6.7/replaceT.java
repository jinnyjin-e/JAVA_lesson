/*							//5번->4번살짝 바꾼코드
	CMD ->  java replaceT 원본파일 대체파일 구단어 신단어
	: 원본 파일에서 구단어가 발견되면 신단어로 교체해서 대체본에 파일 저장
*/

//java replaceT eatTest.java replaceee.java System.out. Hello
// eatTest의 내용 중 'System.out'이 나오면 'Hello'로 바꾸는 코드 만들자

/*
		"Hello, java! Hello wolrd" 에서 -> hello를 HELLO로 변경
		String st1 = "Hello, java! Hello wolrd";
		String st2 = st1.replaceAll("Hello","HELLO");
		System.out.println(st2);
		substring() length() charAt()등등 다시 공부하기
*/

import java.util.*;
import java.io.*;

class replaceT{
	public static void main(String [] args)throws Exception{
				
		
		File f1 = new File(args[0]);//원본
		File f2 = new File(args[1]);//복사본
		
		if(args.length<4){
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
			pw.printf("%s \r\n",ms.nextLine().replaceAll(args[2],args[3]));
		}
			
		pw.close();
		ms.close();//스캐너도 닫으면 좋음
		
		System.out.print("복사완료!");
	}
}