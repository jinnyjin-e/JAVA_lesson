import java.util.Scanner;

class square{
	public static void main(String [] args){
		int i,j, line;
		String n;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("");
		System.out.printf("");
		//프로그램을 계속 진행?? no 입력 시 프로그램 종료, 이외의 값-> 계속 진행?
		System.out.print("프로그램을 계속 진행? ");
		n = ms.next();
		if(n.equals("no")) System.exit(0);//return;
		//return은 return이 위치한 메소드(~=함수) 종료
		//지금의 경우는 main()가 종료-> main이 종료되면 프로그램 종료
//system.exit(정수)는 그 프로그램 자체를 종료시킴
		
		System.out.print("라인 수: ");
		line =ms.nextInt();
		
		
		for(j=1;j<(line+1);j++){
			for(i=1;i<11;i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	/*	int k;
		for(j=1;j<6;j++){
			for(i=1;i<6;i++){
				System.out.print(" ");
			}
			for(k=5;k<6&&0<k;k--){
				System.out.print("*");
			}
		}*/
	}
}	