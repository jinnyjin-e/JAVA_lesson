import java.util.Scanner;
//Scanner,String,System,Math�� ���� �ۼ��� Ŭ������ �ƴ� ���� Ŭ�����̴�.->Scanner�� import����
//java.lang. ��Ű���� �����ϴ� Ŭ������ import ���� �ʾƵ� ��밡���ϴ�.
/* ->java.lang.String
	 java.lang.System
	 java.lang.Math  <-���۸��ϸ� � �͵��� �����ϴ��� �� �� ���� ex)ã����� Math.E �� ������ e��
	���� �͵��� lang ��Ű���� ������ ������
*/
class one{
	public static void main(String [] args){
		double a;
		Scanner ms = new Scanner(System.in);

		System.out.print("�� ������ �Է� ����:");
		a = ms.nextDouble();
		
		/*System.out.println("���� �ѷ� : "+2*Math.PI*a);//�������� Math Ŭ�������� ������
		System.out.println("���� ���� : "+Math.PI*a*a);*/
		
		System.out.println("���� �ѷ� : "+2*Math.PI*a);//�������� Math Ŭ�������� ������
		System.out.println("���� ���� : "+Math.PI*Math.pow(a,2));//pow �Լ�:�����Լ�->pow(��,����)
		System.out.printf("cos(0) �� : "+Math.cos(0));//cos/sin �Լ�
		System.out.printf("\nsin(��) �� : "+Math.sin(Math.PI));//���ȣ: ���Էµ� ���¿��� ���� Ű ���� 
		//sin ��°��� 0 �� �ƴ� 1.22XXXXE-16 �̷������� ���� -> ����
		System.out.printf("\nsin(��) �� : %.4f\n",Math.sin(Math.PI));
		// �̷��� �ϸ� ��°� 0.0000�� ����
	
	}
}