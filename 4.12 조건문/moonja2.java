import java.util.Scanner;

class moonja2{
	public static void main(String [] args){
		/*���ڿ��� ���̸� �˾Ƴ��� �Լ�
�Լ�2		length() �Լ�
		
		ex)   "Hello!!".length();
		ex2)  String abc="javajavajava" ;
			  abc.length();
		
		
�Լ�3		*���ڿ����� ���° ���ڰ� �������� �˾Ƴ��� �Լ�
		charAt(����);       (����+1)��° ���ڰ� �������� �˾Ƴ� // 0��°���� ī��Ʈ��
		
		ex)	   "Hello0!!".charAt(5);
		ex2)   String abc="java!java!java!" ;
			   abc.char(4);
			   //0��° ���ڴ� j 4��° ���ڴ� !
		
�Լ�4		*���ڿ� �����ϴ� �Լ�
		substring(i,j);    (i+1)��° ���ڿ����� j������ ���ڿ� ���� 
		
		ex)	   "ABCDEFG".substring(3,7);
		���: DEFG
		
		*/
		
		String helo;
		char c;
		int x,a;
		
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("���ڿ� : ");
		helo = ms.nextLine(); //����� �ݺ��� �ȿ� �����ʿ� X
		
		while(true){
		System.out.printf("x : ");
		x = ms.nextInt();
		
		a = helo.length();
		if(x>0&&x<a) break;
		System.out.printf("�Է¿���\n");
		}
		
		c = helo.charAt(x-1);
		System.out.printf("%s���� %d��° ���ڴ�\'%s\'�Դϴ�.",helo,x,c);
	}
}









