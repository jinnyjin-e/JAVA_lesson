//����ó��						//6��

import java.util.Scanner;
import java.io.*;


class printT{
	public static void main(String [] args) throws FileNotFoundException{
		Scanner ms = new Scanner(System.in);
		File f =new File("�л�����.txt");  
		System.out.println(f.exists());
		
		String name;
		int age;
		double score;
	
		
		/*����Ʈ �����Ϳ��� ���ܰ� ������� �ִٰ���
		���ܰ� �߻��ϸ� 1.���� ó���ϰų� �Ǵ� 2.��Ź�� ��(���ѱ�)
		throws�� �Ⱦ��� �������ϸ� FileNotFoundException ��¼�� �ϸ鼭 �� �׷���
		2. ����� throws FileNotFoundException���� ���ܸ� ���ѱ�*/
			
	/*	try{
			//���� �߻��Ҽ� �ִ� �ڵ�
		}catch{������Ȳ�߻�}{
			//������Ȳ�ذ�?
		}
		�� ����� 1.����̴�-�����ذ�
		*/
		
		
		
		try{//���1 PrintWriter�� ���� ���� �߻���
		PrintWriter pw = new PrintWriter(f);
		System.out.println(f.exists());
	
		System.out.print("�̸�: ");
		name = ms.next();
		System.out.print("����: ");
		age = ms.nextInt();
		System.out.print("����: ");
		score = ms.nextDouble();
		
		pw.printf("���̸��� ȫ�浿! 25��! ���� 4.6!\r\n");
		pw.printf("%s  %d  %.1f \r\n",name,age,score); /
		pw.close();
		
		//PrintWriter�� ���� ���� �߻������Ƿ� PrintWriter�� pw�� ���Ǵ� ��� �κп��� ���ܹ߻������� -> ��� try�ȿ� �־�� �Ѵ�.
		}catch(FileNotFoundException fnfe){
			System.out.print("���� ��°������� ���� �߻�!");
			return;
		}
		
		
		
		System.out.println("������� �Ϸ�. ����Ȯ�� ���.");
		
		
	}
}