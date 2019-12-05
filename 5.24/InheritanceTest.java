//���

//���� Ŭ���� - ����(�ʵ�) �Դ�(�޼ҵ�)
//��� Ŭ���� - ���� �̸� �Դ� ���ϴ�
//�л� Ŭ���� - ���� �̸� �г� ���� �Դ� ���ϴ� �����ϴ�

/*������ �������ִ� ����/�Դ� �� ����� ��� ������ �ߺ��ؼ� �� �ʿ� X
	 -> extends ���� �̶�� ǥ��
		���: �ڽ�Ŭ����, subclass ��� �� - ��ӹ޴� Ŭ����
		����: �θ�Ŭ����, superclass -����ϴ� Ŭ����
	*/
//����� �������ִ� ���� �̸� �Դ� ���ϴٸ� �л��� ��ӹ��� �� ����

class InheritanceTest{
	public static void main(String [] args){
		//��� ���� �Ա� ��û
		//�л� ���� �̸����� ������� ��û
		Human h1 = new Human(21,"�浿��");
		//�ڽ�Ŭ���� ������ ���� �� �� �θ� Ŭ������ �����ڵ� �����ȴ�.
		h1.eat();
		
		System.out.println();
		
		Student s1 = new Student();
		//s1.name = "ȫ�浿";
		System.out.println("�л��� �̸��� "+s1.name);
		s1.speak();
		
	}
}

class Animal{
	int age;
	void eat(){
		System.out.println("�Խ��ϴ�.");
	}
	Animal(){
		System.out.println("���� ����");
	}
	Animal(int age){
		this.age =age;
		System.out.println("���� ����");
	}
	
}

class Human extends Animal{
	// ����(��ӹ���) �̸� ����	
	String name;
	//�Դ�(��ӹ���) ���ϴ� ����
	void speak(){
		System.out.println("����� ���մϴ�.");
	}
	Human(){
		System.out.println("��� ����");
	}
	//���̿� �̸��� �ʱ�ȭ�ϴ� ��������� �����
	Human(int age, String name){
	//	super.age = age; 
		//�θ�Ŭ����(super class)�� ���� �����´ٰ� �ؼ� super.�� this.age ��� �ᵵ�ȴ�.
		//�׷��� ����Ŭ������ �����ڿ��� �ʱ�ȭ���ִ°��� �� ����. �׷��� �Ʒ�ó�� ǥ��
		super(age);//������ ȣ���� ���� ���ʿ��� ������, �θ�Ŭ�������� ȣ���ؿ´ٴ� ��
		this.name = name;
		System.out.println("��� ����");
	}
}

class Student extends Human{//�޸��� ��ӹ���
	//���� �̸� �г� ����
	int grade;
	double score;
	
	//�Դ� ���ϴ� �����ϴ�
	void study(){
		System.out.println("�����մϴ�.");
	}
	//���ϴٿ��� "�л��� ���մϴ�" ��� ��ġ�����
	@Override//<-��� ��� �ǰ� �־ �ǰ�(�缱�� �Ѵٴ� ���� ����)/�ٵ� ������ �Ǽ��� �߸� ������ ã�Ƴ���
	void speak(){
		System.out.println("�л��� ���մϴ�.");
		//�տ��� ������� speak�� ������ ���� ��(�ʱ�ȭ �� ���� �缱�� �ϴ� �� ���� ����)
		//�̰��� �޼ҵ� ������ ��� �Ѵ�.(Override)
		//Ŭ������ �����ǰ� �ְ�, �ʵ�� ������ �� �� ����.
	}
	
	Student(){//���������(�θ�Ŭ������ �����ڰ�) �ڵ����� ȣ���
		System.out.println("�׻� ����");
	}
}