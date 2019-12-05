// ���� ������ �Ű������� �޴� eat() �޼ҵ�
// ���̸� �Ű������� �޴� eat() �޼ҵ� =>ex) myDog.eat("���̽�ũ��");
		//<-�ߺ����� �غ���

class Dog{
	int full;
	String name;
	String type;
	double height;
	double weight;
	
	void eat(int food){
		full += food;
		System.out.println("���ֳ׿�. ");
	}
	void eat(String food){
		full += 10;
		System.out.println(food+"��(��) ���ֳ׿�. ");
	}
	//�Ȱ��� eat�������� �ߺ������ߴ�.
	
	
	//��ü�� ������µ� ��ü�� ����(�̸�,Ÿ��,Ÿ�� ����� ������)�� �ϳ��� ����(Null) �Ǵ� ��� ����
	//->�׷��� �����ڸ� �����.

	//������(constructer): ��ü�� ���� �� ��, �ʵ尪�� �ʱ�ȭ�ϴ� Ư���� �޼ҵ�
/*		1. ��ü ������ �� �� �ѹ� ȣ��ȴ�. 
		2. ��ȯŸ���� ����. (void�� �ƴ�!@!@!@)
		3. �޼ҵ��̸� == Ŭ�����̸�
		
		ex) Scanner ms = new Scanner() ���� Scanner()�� �������� => ����Ʈ ������ ȣ����
		�����ڸ� �ϳ��� �ۼ����� �ʾҴٸ� ����Ʈ ������ �ڵ����� �������
		ex2) Dog myDog = new Dog();��⿡���� ����Ʈ ������ �������
*/   
	//�̸��� �����Ը� �ʱ�ȭ�ϴ� ������ �ۼ��ϱ�
	Dog(String name, double weight)	{
		if(name.length()<10) this.name = name; //���� name�� ������ name�̰�, ���� name�� Dog�Լ� ���� name��
		else this.name = "�ǻ�";

		if(weight<=50 &&weight>0) this.weight = weight;
		else this.weight = 15;
		
	}
	//�̸��� ��,������,Ű�� �ʱ�ȭ�ϴ� ������ �ۼ��ϱ�(�ߺ����Ƿ�)

	Dog(String name, String type, double weight, double height)	{
		//���� Dog�Լ����� �ߺ��Ǵ� �κ��� ���� �ϴ°ͺ��� ȣ���ϴ°��� ��~�� ����
		
		this(name,weight);//�䷸�� �̸��̶� ������ �ҷ��ͼ� ������ this�ڿ� �ٸ� �����ڸ� ȣ���Ѵ�?�����(���Ҹ���)
		//������ ���ο��� �ٸ� ������ ȣ�� ����
		//��, �Լ��� �� ù°���ο����� ����!
		
		this.type = type;
		
		if(height<=100 && height>0) this.height = height;
		else this.height = 30;
		
	}

	
	//��ü ������ "���" ��ȯ�ϴ� �޼ҵ�: toString() �޼ҵ�
	//���ڿ� ���·� ��ȯ�Ѵ�
	public String toString(){//��� ������ public �پ�ߵȴ�. �� �Ѵ�.
		//return "������: "+full+", �̸�: "+name+", ��: "+type+", Ű: "+height+", ����: "+weight;
		//�� ������� + �� " �� ��� ���� �����Ƽ� format�����
		return String.format("������: %d, �̸�: %s, ��: %s, Ű: %.1f, ����: %.1f",full,name,type,height,weight);//���� �տ� ��Ʈ�� �������� ���� �̷� ���ڿ��� �����Ͽ� �����ϰڴ�~ ��� ��
	}
	
	
}

class I{
	public static void main(String [] args){
		Dog myDog = new Dog("������",17);
		Dog yourDog = new Dog("�Ϳ���Ѹ��¿ܷο�Ʊ����","Ƽ�����罺",1000,120);
/*		
		System.out.printf("���� ������: %s %s %.2f %.2f \n", myDog.name, myDog.type, myDog.weight, myDog.height);
		System.out.printf("���� ������: %s %s %.2f %.2f \n",yourDog.name,yourDog.type,yourDog.weight,yourDog.height);//�̷��� ������ ġ�� �����Ƽ� toString�޼ҵ� ���� ����� ����
		*/
		System.out.println();
		System.out.println(myDog.toString());
		System.out.println(yourDog);
		//��ü ����������  ����϶�� ��û�ϸ� �ڵ������� toString()�޼ҵ带 ȣ���Ͽ� �� ����� ��µ�
		//���� yourDog.toString() �̶�� �� �� ���� �׳�  yourDog��� �ᵵ �ȴٴ� ���� ������
		
		myDog.eat(10);
		myDog.eat("���̽�ũ��");
		
	}
}