import java.util.Scanner;

class DaysInMonth{
	public static void main(String [] args){
		int year, month, days;	
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		year = s.nextInt();		//����ڷκ��� ������� �Է� ����
		System.out.print("�� �� : ");
		month = s.nextInt();	//����ڷκ��� ������� �Է� ����
		
		switch(month){
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			days=31;
			break; 	//�� �޵��� 31���� �ִµ�, �̹� days�� 31���� �����صξ��� ������ days�� �� �� �ʿ� ���� break�ɾ switch�� ���� ������ ��
		case 4:	case 6:	case 9:	case 11:
			days = 30;	//�� �޵��� 30���� �����Ƿ� ���� days�� 30���� �ٲ��ְ� 
			break;		//break�ɾ switch�� ���� ������ ��
		case 2: //2���� ��� ����
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) days = 29; //������ ��� 
			else days = 28;			//������ �ƴ� ���
			break;
		default: 
			System.out.println("�׷� ���� �����ϴ�."); 		//�̿��� ���� �Է��� ���
			return;
		}
		
		System.out.print(year + "�� " + month + "���� "+ days+ "�ϱ��� �ֽ��ϴ�.\n");
		
	}
}