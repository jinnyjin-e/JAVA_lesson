import java.util.Scanner;

class ifmoon{
	public static void main(String [] args){
		int n;
		Scanner ms = new Scanner(System.in);
		
		//���˹���1-1
		System.out.print("n�� �Է�: ");
		n = ms.nextInt();
		
		if(n>=100) System.out.println("large");
		else System.out.println("small");
		// else ��ſ� �ٽ� if���� �Ἥ if(n<100)~~~~  ��Ÿ���� �ȴ�.
		
		
		//���˹���1-2
		int c;
		
		System.out.print("c�� �Է�: ");
		c = ms.nextInt();
		
		if(c<100)
			System.out.print("small");
		else if(c<200)
			System.out.print("medium");
		else
			System.out.print("large");
		/*���� ����
		if(c<100)
			System.out.print("small");
		else {
			if(c<100)
			System.out.print("medium");
			else
			System.out.print("large");
		}�� ��Ÿ������ �ִ�.
		*/
		
		//Nested if��		
		
	}
	
}