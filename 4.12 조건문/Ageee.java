import java.util.Scanner;

class Ageee{
	public static void main(String [] args){
		int age;
		Scanner ms =new Scanner(System.in);

//���ǹ�ver.1		
		/*System.out.printf("����: ");
		age = ms.nextInt();
		//���� ������ �ݺ��Ǵ°��� ���ϱ� ���� do while�� ���
		
		while(age<0||age>200){
			if(age<00||age>200) System.out.printf("[�Է¿���]\n");
			System.out.printf("����: ");
			age = ms.nextInt();
			
		}
		System.out.printf("����� ���̴� %d �Դϴ�.",age);
		*/
		
		/*
		do while�� �� �Ʒ��� ���� ��Ÿ��������
		do while�� �ּ�1�� �ݺ�(����), �׳� while�� �ּ� 0�� ����!!
		
	do{
		�ݺ��� ����
	}while(����); 		<- �����ݷ� �ʼ���!
		*/
//���ǹ�ver.2
		/*do{
		System.out.printf("����: ");
		age = ms.nextInt();
		if(age<00||age>200) System.out.printf("[�Է¿���]\n");
		}while((age<00||age>200));
		*/
		
//���ǹ�ver.3
		/*���ѹݺ� ����� : while(True){����} �� ����� ���� ���ѹݺ� ����
		Ư�� ������ �����ϸ� �ݺ��� Ż�� �ؾߵȴ�.*/
		
		while{
		System.out.printf("����: ");
		age = ms.nextInt();
		if(age<00||age>200) break; //Ż������
		System.out.printf("[�Է¿���]\n");
		}
		
	}
}






