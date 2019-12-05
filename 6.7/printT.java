//사용자로 부터 나이,이름,학점 그 정보를 "학생정보.java"파일에 출력  //2번
import java.util.Scanner;
import java.io.*;


class printT{
	public static void main(String [] args) throws FileNotFoundException{
		Scanner ms = new Scanner(System.in);
		File f =new File("학생정보2.txt"); //1) 파일 만들었음
		//실제로 여기서 텍스트 파일 만들어지는거 아님!->객체만 생성된거임
		
/*1번*/	System.out.println(f.exists());
		
		String name;
		int age;
		double score;
		
	
		PrintWriter pw = new PrintWriter(f);
		//2) 프린트라이터 만들었음 : 해당 파일과 쁘린트롸이타-(output Stream임)랑 연결하겠다
		
		
		//프린트라이터에 연결되면서 실제 파일이 만들어짐
/*2번*/	System.out.println(f.exists());
	
		
		System.out.print("이름: ");
		name = ms.next();
		System.out.print("나이: ");
		age = ms.nextInt();
		System.out.print("학점: ");
		score = ms.nextDouble();
		
		pw.printf("내이름은 홍길동 5살이지! 학점은 0.7이다!\r\n");
		
		//System.out.printf("%s  %d  %.1f \n",name,age,score); //얘는 모니터에 출력
		pw.printf("%s  %d  %.1f \r\n",name,age,score); //얘는 pw(printWriter)를 이용하여 파일에 출력
		// 자바에서 개행(줄바꿈)은 \n이지만 윈도에선 \r\n 이므로 저렇게 표시
		
		pw.close();//버퍼에 있는 내용 모조리 이동, 그 후 이 스트림 닫음
		// 얘 없으면 텍스트 파일에 아무것도 안나옴
		
				
		System.out.println("파일출력 완료. 폴더확인 요망.");
		
		
	}
}