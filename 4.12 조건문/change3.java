import java.util.Scanner;

class change3{
	public static void main(String [] args){
		int x, y, chg;
		int a;
		String st, sub;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("���ڿ�: ");
		st = ms.next();
		a = st.length();
		
		do{
			System.out.printf("a: ");
			x = ms.nextInt();
			if(a<x||x<0) System.out.printf("[�Է¿���]\n");
		}while(a<x||x<0);
		do{
			System.out.printf("b: ");
			y = ms.nextInt();
			if(a<y||y<0) System.out.printf("[�Է¿���]\n");
		}while(a<y||y<0);
		
		if(x>y){
			chg=x;
			x=y;
			y=chg;
		}
		sub = st.substring(x-1,y);
		System.out.printf("%s���� %d��°����,%d��° ���ڱ��� �߶� ���ڿ��� \"%s\"�Դϴ�.",st,x,y,sub);
	}
}