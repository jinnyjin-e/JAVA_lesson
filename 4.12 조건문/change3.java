import java.util.Scanner;

class change3{
	public static void main(String [] args){
		int x, y, chg;
		int a;
		String st, sub;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("문자열: ");
		st = ms.next();
		a = st.length();
		
		do{
			System.out.printf("a: ");
			x = ms.nextInt();
			if(a<x||x<0) System.out.printf("[입력오류]\n");
		}while(a<x||x<0);
		do{
			System.out.printf("b: ");
			y = ms.nextInt();
			if(a<y||y<0) System.out.printf("[입력오류]\n");
		}while(a<y||y<0);
		
		if(x>y){
			chg=x;
			x=y;
			y=chg;
		}
		sub = st.substring(x-1,y);
		System.out.printf("%s에서 %d번째부터,%d번째 문자까지 잘라낸 문자열은 \"%s\"입니다.",st,x,y,sub);
	}
}