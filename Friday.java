//����ڷκ��� x�� �Է¹޾� x�� ���� ������ ����ϴ� Ǵ�� �ۼ�
/* ������ �ݿ���
	ex) ��ĥ �� : 1 �̶�� �Է� ��
	1�ϵڴ� 6���� �Դϴ�
	
	�� ����ϱ� ( ������ =1����, ȭ����=2���� ...... �Ͽ���=0����);
*/
import java.util.Scanner;

class Friday{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in); 
		int day, a;
		
		System.out.println("������ �ݿ��� �Դϴ� ");
		System.out.printf("��ĥ �� : ");
		day = ms.nextInt();
		
		System.out.printf("%d�� �ڴ� %d���� �Դϴ�.\n",day,(day+5)%7);

		
	}
}