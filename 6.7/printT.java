//����ڷ� ���� ����,�̸�,���� �� ������ "�л�����.java"���Ͽ� ���  //2��
import java.util.Scanner;
import java.io.*;


class printT{
	public static void main(String [] args) throws FileNotFoundException{
		Scanner ms = new Scanner(System.in);
		File f =new File("�л�����2.txt"); //1) ���� �������
		//������ ���⼭ �ؽ�Ʈ ���� ��������°� �ƴ�!->��ü�� �����Ȱ���
		
/*1��*/	System.out.println(f.exists());
		
		String name;
		int age;
		double score;
		
	
		PrintWriter pw = new PrintWriter(f);
		//2) ����Ʈ������ ������� : �ش� ���ϰ� �ڸ�Ʈ����Ÿ-(output Stream��)�� �����ϰڴ�
		
		
		//����Ʈ�����Ϳ� ����Ǹ鼭 ���� ������ �������
/*2��*/	System.out.println(f.exists());
	
		
		System.out.print("�̸�: ");
		name = ms.next();
		System.out.print("����: ");
		age = ms.nextInt();
		System.out.print("����: ");
		score = ms.nextDouble();
		
		pw.printf("���̸��� ȫ�浿 5������! ������ 0.7�̴�!\r\n");
		
		//System.out.printf("%s  %d  %.1f \n",name,age,score); //��� ����Ϳ� ���
		pw.printf("%s  %d  %.1f \r\n",name,age,score); //��� pw(printWriter)�� �̿��Ͽ� ���Ͽ� ���
		// �ڹٿ��� ����(�ٹٲ�)�� \n������ �������� \r\n �̹Ƿ� ������ ǥ��
		
		pw.close();//���ۿ� �ִ� ���� ������ �̵�, �� �� �� ��Ʈ�� ����
		// �� ������ �ؽ�Ʈ ���Ͽ� �ƹ��͵� �ȳ���
		
				
		System.out.println("������� �Ϸ�. ����Ȯ�� ���.");
		
		
	}
}