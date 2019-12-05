//예외처리						//6번

import java.util.Scanner;
import java.io.*;


class printT{
	public static void main(String [] args) throws FileNotFoundException{
		Scanner ms = new Scanner(System.in);
		File f =new File("학생정보.txt");  
		System.out.println(f.exists());
		
		String name;
		int age;
		double score;
	
		
		/*프린트 라이터에서 예외가 생길수도 있다고함
		예외가 발생하면 1.직접 처리하거나 또는 2.부탁을 함(떠넘김)
		throws를 안쓰고 컴파일하면 FileNotFoundException 어쩌고 하면서 뜸 그러면
		2. 방법인 throws FileNotFoundException으로 예외를 떠넘김*/
			
	/*	try{
			//문제 발생할수 있는 코드
		}catch{문제상황발생}{
			//문제상황해결?
		}
		이 방법이 1.방법이다-직접해결
		*/
		
		
		
		try{//방법1 PrintWriter에 의해 오류 발생함
		PrintWriter pw = new PrintWriter(f);
		System.out.println(f.exists());
	
		System.out.print("이름: ");
		name = ms.next();
		System.out.print("나이: ");
		age = ms.nextInt();
		System.out.print("학점: ");
		score = ms.nextDouble();
		
		pw.printf("내이름은 홍길동! 25살! 학점 4.6!\r\n");
		pw.printf("%s  %d  %.1f \r\n",name,age,score); /
		pw.close();
		
		//PrintWriter에 의해 예외 발생했으므로 PrintWriter인 pw가 사용되는 모든 부분에서 예외발생가능함 -> 모두 try안에 넣어야 한다.
		}catch(FileNotFoundException fnfe){
			System.out.print("파일 출력과정에서 문제 발생!");
			return;
		}
		
		
		
		System.out.println("파일출력 완료. 폴더확인 요망.");
		
		
	}
}