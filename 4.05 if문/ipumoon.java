import java.util.Scanner;

class ipumoon{
	public static void main(String [] args){
		int a;
		String jong;
		
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("����? : ");
		jong = ms.nextLine();
		System.out.print("����? : ");
		a = ms.nextInt();
		
		/* == :�������� ���ϴ°�
		jong���� 2���̶�� ���ڿ��� '�ּ�'�� ���ִ�.... �׷��� ó���� �������
				/�����ڷ����� ����� ����(���������� ������ �����ϱ� ������)
				������ String�� ���� �����ڷ����� �ּҰ��� �����ϱ� ������ ���������� �񱳺Ұ���
		if(jong == "1��")��� �ϸ� �ּҸ� ���ϰ� �ȴ�.... 
		
		equals() ��� �Լ��� ���Ͽ� �񱳰���! -> jong.equals("1��") <=�̷������� ǥ�� :jong�� "1��"�̶�� ���ڿ� ������ Ȯ��
				�Ʒ�ó�� "2��".equals(jong) <- �̷��Ե� ǥ������ : "2��"�� jong�� ������ Ȯ��
		��°���True/False�� ��µȴ�.
		*/ 
		
	/*
		if(jong.equals("1��")){ //(if(jong.equals("1��")== True) ��� �Ұ;��� ���̸� �����̹Ƿ� ������ ����
			if(a>=60) System.out.println("\t=> �հ�");
			else System.out.println("\t=>���հ�");
				
		}
		else if("2��".equals(jong)){//2��° ���
			if(a>=70) System.out.println("\t=> �հ�");
			else System.out.println("\t=>���հ�");
		}
		else System.out.println("\t=>[�Է¿���] �׷����� �����ϴ�.");
		
	*/
		switch(jong){
			case "1��":
				if(a>=60) System.out.println("\t=> �հ�");
				else System.out.println("\t=>���հ�");
				break;
			
			case "2��":
				if(a>=70) System.out.println("\t=> �հ�");
				else System.out.println("\t=>���հ�");
				break;
			
			default:
				System.out.println("\t=>[�Է¿���] �׷����� �����ϴ�.");
		}
		

	}
}