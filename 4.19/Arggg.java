import java.util.Scanner;

/*
String [] args�� args��� �迭 �̶�� ���̾���!

class Ŭ������ ���� ������ args �迭�� ������ ��Ÿ��
??����������...
*/
class Arggg{
	public static void main(String [] args){
//		System.out.print("�迭 ���Ƥ���s�� �迭��"+args[0]+"\n");
		/*java Arggg ġ�� ����! �� �ƴ϶�
		java Arggg (�迭) (�迭) (�迭) �� ���·� �Է�!
			Ex) javac Arggg.java 
				java Arggg 4 12 8 
				�� ���� �Է�
		*/
		
//		System.out.print("Ŀ�ǵ� ������ �� ������ ��"+args[0]+" "+args[1]);//�̷����ϸ� ���� �ȳ���
		// Ŀ�ǵ� ����(�����-Ŀ�� �����̴� �κ�)
		
		if(args.length<2){
		System.out.print("����: ����1 ����2");
		return;
		}
		
		System.out.print("Ŀ�ǵ� ������ �� ������ ��"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		//args[a]�� �� �� ��ü�� �ƴ϶� �ּ��̴�(String �̱� ������)
		//������ �ٲٱ� ���� �Լ�"Integer.parseInt(~~~)"�� ������ش�
		//Double.parseDouble[0]�̶�� �ϸ� �Ǽ������� ��������
		
	}
}