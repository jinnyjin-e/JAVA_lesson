import java.util.Scanner;

class OperatorTest{
	public static void main(String [] args){
		System.out.println("1+2 = "+1+2);
		//+�� ������ �ǹ̷� ���Ǿ��� ������ 12�� ��µȴ�: ����+�� ����+ �� ����+�� ���� ������ �� ���Ĵ� ���� ����+�� �ν�
		System.out.println(1+2+"=1+2");// �̷����̸� 3 = 1+2 �� ��µȴ� ����+�� ���� ����ϰ� ���� +���
		System.out.println("1+2 = "+(1+2));// �� ǥ���ϸ� ����+�� �����ϱ� ������ 1+2=3 ��µȴ�
	//	System.out.println(5/0); //'����' �߻� ->������ ������ �ٸ�! �������� �Ǵµ� ����� �� ������ ��
		System.out.println(5.0/0); //�� ��쿹��x why?)�Ǽ��������� 0�� 0�� �ƴ϶� 0�� ����� �������� ���->infinity ����
		System.out.println(0.0/0.0); //�� ��� infinity�� �ƴ�! NaN : Not a Number ���
		
		//���������� ȭ���µ��� �Է¹ް� ����,ȭ���� ��� �غ���!
		Scanner ms = new Scanner(System.in);
		int temp;
		
		System.out.print("�µ� �Է� : ");
		temp = ms.nextInt();//41�� �Է�
		
	//	������ ����!	
		System.out.println("ȭ���µ��� : "+temp);
		System.out.println("�����µ��� : "+((double)5/9*(temp-32)));
		// [5/9*((double)temp-32)]�� �ϸ� 5/9�� 0���� ��޵Ǿ double�� �տ� ����� �Ѵ�.
		
		
		
	}
}