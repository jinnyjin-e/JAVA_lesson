/*����: (�ڹٿ����� ���ϵ� �ϳ��� ��ü�� ����)*/ // 1��
import java.io.*;//���� ����� �� ������ java.io ��Ű���� ��� ����Ʈ
class fileT{
	public static void main(String [] args){
		//���� ���� �ȿ� �ִ� eatTest�� �����ϰ� ���� -> eatTest��� ������ ��ü�� �����־��Ѵ�
		File f1 = new File("eatTest.java");//���� �����ȿ� ������ �����(���ϸ� ���� ��)�� ���ٰ���
		File f2 = new File("D:\\�ݿ���\\6.7\\eatTest.java");//������ "D:\�ݿ���\6.7"�� eatTest ������ �ִ� �����ּ�(��ġ)
														//  �׷��� \ �� ������̹Ƿ� \\ ó�� \�� �ΰ� ����Ͽ��� �Ѵ�.
		File f3 = new File("ABC\\def.java"); //�����׽�Ʈ�� �ִ� ����(6.7)���� ����(ABC)�� �ִ� ������ ȣ�� �� ��(�������� ȣ��)
		File f4 = new File("ABC"+File.separator+"abc.java"); // abc��� �ڹ����ϴ� ����
		
		// �������� �����ּҸ� ǥ�� �� �� \\ �� ������ ���������� / �����->�÷����� �������̱� ������ ���������� ��밡���� ���� �ʿ��ϴ�
		// '/' ��ſ� File.separator �� ����ϸ� ���� ���� ������ : ����������
		// separator ��� static �ʵ� �̴� ������
		
		
		System.out.println("f1������ ������ �����ϴ°�? "+f1.exists());
		System.out.println("f4������ ������ �����ϴ°�? "+f4.exists());
		// exists() : ���� �Ǵ� ������ ������ �����ϴ����� ���� �Լ� 
		
		System.out.println("f2������ �̸���? "+f2.getName());
		System.out.println("f2������ �̸���? "+f3.getName());
		// getName() : ���� �̸��� �˾Ƴ� �� ���
		
		System.out.println("f2 �� ������ΰ�? �ñݤ�"+f2.isAbsolute());//������� -> Ʈ��
		System.out.println("f3 �� �������ΰ�? �ñݤ�"+f3.isAbsolute());//�������� -> false
		System.out.println("f3 �� �������ΰ�? �ñݤ�"+f3.getAbsolutePath());//������ �ּ�
		// �̰� ���� ���߿���
		
		System.out.println("f3��... ��..."+f3.isDirectory());//�� �̰� ������ �ٵ� ���� �߿�X
		
		System.out.println("f3�� ���� ������"+f3.lastModified());//��¥�̱� �ѵ� �츮�� �ƴ� yy/mm/dd ������ �ƴ�
		System.out.println("f3�� ���� ������"+new java.util.Date(f3.lastModified()));//print���ο��� import����!! / �̷��� �ϸ� �츮�� �ƴ� ��¥�������� ����
		
	}
}	