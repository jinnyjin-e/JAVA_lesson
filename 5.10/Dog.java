//�� �������� �������� 5 �̻��̸� ����ְ�, �ƴ϶�� ���̸� �ش�.
//Ŭ���� -> ���赵 �� �ǹ�
public class Dog{
//�ʵ�, �޼ҵ� :Ŭ���� ���
//�ʵ� 	- ��� ����
//�޼ҵ� 	- ��� �Լ� 
	
	//�ʵ� :Ŭ���� ���ο� ����(�޼ҵ� ���ΰ� �ƴ�)
	//��������: �żҵ� ���ο� ����
	//�ʵ�� �ʱ�ȭ���� �ʴ´ٸ� �ڷ����� �´� 0 ���� �ڵ� �ʱ�ȭ
	
	private String name; //������ �̸�
	private int full; //������
	
	//�ʵ��� ��� private ���� �� ����
	//dogŬ���� �ۿ����� ����full�� ���� �Ұ���@@@/������ �Ұ���(�� Ȯ��)
	//�����ϸ� �ʵ��� ������ �ܺο��� ���� �Ұ����ϵ��� private ���̶���
	
	//private�� �ʵ忡 ���� gettet() �� �ۼ�! 
	//-> private�� �ʵ尪��  "Ȯ��"�����ִ� �޼ҵ��� ��

	int getFull(){//�޼ҵ��̱⶧���� ��.��.�� �ڷ��� ������ߵȴ�.
		return full;
	}
	String getName(){//�굵 private �ٿ���� ������ �������ߴ�
		return name;
	}
	
	//private�� �ʵ��� ���� "����"�ϴ� �޼ҵ� setter()�� �ۼ�!
	//set�ʵ��() �� ������
	void setName(String name){
		//���� �����Ϸ��� �̸��� ���̰� 10���� �۴ٸ� ���
		//�̸��� ���̰� 10 �̻��̶�� "������"�� ����
		if(name.length()<10) this.name = name ;// ��(this) ��ü�� name�� �Ű����� name���� �޴´�
		else this.name = "������";// ������ name�� SetName(String name)�� name�̴�.return;
	}
	
	
	
	
	//�޼ҵ�
	void eat(int food){//food���� ���̸� �Դ� �ൿ
		if(food>0){
			full += food;
		
			System.out.printf("���̸� %d�� �Ծ����� ��θ��׿� ^______^ \n",food);
		}
		else{
			System.out.printf("���̸� �ּ��� '____' \n");
		}
	}
	
	void play(){//��� �ൿ
		System.out.printf("��������մ礻���� ^ �� ^ ");
	}
}