
//����ڷκ��� -10���� 10 ������ ������(����)�� �Է¹���
//-10���� 10���� ���� ����
//����ڰ� ���������ϸ� �հ�! ���ϸ� ���հ�! ���

import java.util.Scanner;

class RanTest{
	public static void main(String [] args){
		// 0�̻� 1�̸��� �Ǽ��� �����ѹ� ����
		int a,b;
		double ran;
		Scanner ms = new Scanner(System.in);
		
		ran = Math.random();
		
		System.out.println("�������� �Է��ϼ���");
		b = ms.nextInt();
		System.out.println("��������"+(int)(ran*21-10));
		a = (int)(ran*21-10);
		System.out.println(a==b?"�հ�!":"���հ�!");
		if (user 
		
		ran = Math.random();
		System.out.println(ran);
		//1)0 �̻� 10 �̸��� �Ǽ��� �����ѹ� ����
		//2)0 �̻� 10 ������ ������ �����ѹ� ����
		//3)25�̻� 60 ������ ������ �����ѹ� ����
		
		//1)
		System.out.println(ran*10);
		System.out.println((int)(ran*10));

		
		//2)10���ϰ� �Ǳ� ���ؼ��� 11�� ���Ͽ� 10.999���� ������ �ǵ��� �ؾߵȴ�.
		System.out.println((int)(ran*11));

		//3) 25�̻� 60 ���ϰ� �Ǳ� ���ؼ��� ���ϱ�36 �Ŀ� 25�� �����ָ� 25�̻� 61�̸�(60����)	
		System.out.println((int)(ran*36+25));		
		
		
	}
}