//�л�����.txt�� ����� �л� ���� �о���� //3��

import java.util.Scanner;
import java.io.*;

class scanT{
	public static void main(String [] args)throws Exception{
		File f =  new File("�л�����.txt");
		Scanner ms = new Scanner(f);// System.in(=Ű����) �� �ƴ϶� f�� ���� �Է¹���
		//f.exists()�� ����Ͽ�
		//���� ������ �������� �ʴ´ٸ� ����ڿ��� �̸� �˸��� ���α׷� ��������
		if(f.exists()==false){
			System.out.println(f.getName()+"��� ������ �������� �ʾ� ���α׷��� �����մϴ�.");
			System.exit(1);//return�� ����� �ǹ�
		}
		
		
//		System.out.println(ms.nextLine());
//		System.out.println(ms.nextLine());
		
		
		//���� ������ �״�� ������� �ʰ�, �Ʒ�ó�� ����ϰ����
		//�̸�: ȫ�浿, ����: 5,  ����:4.3 ����
		
		String name;
		int age;
		double score;
		
	//	for(int i = 0 ; i<=1;i++) �������� �˸� for �ϴµ� �𸣸� while ����
		while(ms.hasNext()==true){//������ ��� �� ���� �����ִ°�?
		name = ms.next();
		age = ms.nextInt();
		score = ms.nextDouble();
		
		System.out.printf("�̸�: %s, ����: %d,  ����: %.1f \n",name,age,score);
		}
		
	}
}