//학생정보.txt에 저장된 학생 정보 읽어오기 //3번

import java.util.Scanner;
import java.io.*;

class scanT{
	public static void main(String [] args)throws Exception{
		File f =  new File("학생정보.txt");
		Scanner ms = new Scanner(f);// System.in(=키보드) 가 아니라 f로 부터 입력받음
		//f.exists()를 사용하여
		//만약 파일이 존재하지 않는다면 사용자에게 이를 알리고 프로그램 종료하자
		if(f.exists()==false){
			System.out.println(f.getName()+"라는 파일이 존재하지 않아 프로그램을 종료합니다.");
			System.exit(1);//return과 비슷한 의미
		}
		
		
//		System.out.println(ms.nextLine());
//		System.out.println(ms.nextLine());
		
		
		//파일 내용을 그대로 출력하지 않고, 아래처럼 출력하고싶음
		//이름: 홍길동, 나이: 5,  학점:4.3 요롷게
		
		String name;
		int age;
		double score;
		
	//	for(int i = 0 ; i<=1;i++) 몇줄인지 알면 for 하는데 모르면 while 쓰자
		while(ms.hasNext()==true){//다음에 출력 할 것이 남아있는가?
		name = ms.next();
		age = ms.nextInt();
		score = ms.nextDouble();
		
		System.out.printf("이름: %s, 나이: %d,  학점: %.1f \n",name,age,score);
		}
		
	}
}