//����ڷκ��� �� ������ �Է¹޾� �ִ� ����ϱ�
import java.util.Scanner;
class Maximum{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		
		int a, b ;
		
		System.out.print("�� ���� �Է�: ");
		a = ms.nextInt();
		b = ms.nextInt();
		
		System.out.printf("�� ū ���� "+(a>b?a:b));
		//(a>b?a:b) �ǿ����ڵ��� ���� '����'�� �̶�� �����Ͻ� ��������
		
		int max;
		max = a>b?a:b ;
		System.out.printf("\nMax : "+max);
		//��� ǥ���ص� ���� 
		
		String s;
		s = (max==a)?"�ִ�� ���� �� �Դϴ�":"�ִ�� ���� �� �Դϴ�";
		s = (a==b)? "�� ���� �����մϴ�":s;
		
		System.out.printf("\n�Է��� �� ����, %d, %d�̸�, %s \n",a,b,s);
		
	}
}