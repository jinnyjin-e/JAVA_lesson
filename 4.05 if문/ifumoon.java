import java.util.Scanner;

class ifumoon{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);		
		int input, b=10;
		
	/*	System.out.print("���� �Է�: ");
		input = ms.nextInt();
		
		if(input>0)
			b=1;
		else if(input<0)
			b=-1;
		else if(input==0)
			b=0;
			
		//���ǹ����� �ʱ�ȭ �ÿ��� else�� default�� �� �־�� �ȴ�!
		//���� ����� �ʱ�ȭ ���شٸ� else ��� �ȴ�!!		
		
		System.out.println(b);
	*/	
		int y, m, d=0;
		
		System.out.printf("��� : ");
		y = ms.nextInt();
		System.out.printf("��� : ");
		m = ms.nextInt();
		
		switch(m){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				d = 31;
				break;
			case 4: case 6: case 9: case 11:
				d=30;
				break;
			case 2:
				if((y%400==0)||((y%4==0)&&!(y%100==0)))
					d=29;
				else
					d=28;
				break;
			default:
				System.out.printf("�ش��ϴ� ���� �����ϴ�.");
			
		}
		System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.",y,m,d);
		
		
	}
}