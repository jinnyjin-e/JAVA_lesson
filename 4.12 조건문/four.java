import java.util.Scanner;
/*
		for��
		for(���� ����,�ʱ�ȭ;�ݺ�����;������){
			�ݺ��� ����	
		}
*/
class four{
	public static void main(String [] args){
		
		/*for(;;){//���ѹݺ���-> while(true)�� ����. ��� �����ݷ� �ΰ��� ������ �־�� �ȴ�. ���α׷�(�ݺ�) ���� �� ctrl+C
			System.out.println("Hello, world!");
		}
		*/
		for(int i=0;i<5;i++){
			System.out.print("Hello, world!\n");
		}
		// int i�� for �ȿ��� ����ȰŸ� for�ۿ��� i�� ����� ���°� �ƴ�
		// ���� for �ۿ��� i�� �����ϰ� for �Ϸ��ϸ� �ۿ��� i=5�� ���·� ��밡��
		
	/*	for(int i=1;i<11;i++){
			System.out.print(i+"\n");
		}
	*/	
		for(int i=11;i<128;i+=4){//i+=4�� ǥ������
			System.out.print(i+" ");
			//print(4*i+7);�� ����ϰ� i=1�� �ʱ�ȭ, �������� i++����ص� �ȴ�.
			
		}
		for(int i=127;i>=11;i-=4){//i=i-4��� ��
			System.out.print(i+" ");
			//print(4*i+7);�� ����ϰ� i=1�� �ʱ�ȭ, �������� i++����ص� �ȴ�.
			
		}
		
	}
}