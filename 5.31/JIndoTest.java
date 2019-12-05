class JindoTest{//�����ð� ���� �������δٰ� �Ԥ� 1��
	public static void main(String [] args){
		Jindo j1 = new Jindo();//j1�� �ڷ����� 'Jindo'�̴� ��� �������ָ� ���ϴ�~
		Dog j2 = new Jindo();//� �������� ������µ� ��� �������̴� <-���̵ǳ�? �׷� �Լ������ε� ���̵ȴ� (��Ӱ����̱� ������ ����)
		Pet j3 = new Jindo();//�� ��쵵, � �������� ������µ� ��� �ֿϵ����̴� : ���̵ȴ�
							//j2,j3�� ��� -> ��ĳ���� �̶�� �� : ĳ����-����ȯ �� ���� ����
		//������(polymorphism): �ϳ��� ��ü�� ���� �ڷ������� ���� �� �� �ִ� ��
		
	//	Cat j4 = new Jindo();//�� ���� ��Ӱ迭�� �ٸ��� ������ ��� �Ұ��� ��
		
		//��ĳ������ �Ѱ� : ���ٰ����� �ʵ�� �޼ҵ尡 ���ѵ�
		System.out.println(j1.color);
	//	System.out.println(j2.color);
		//��� Dog�� �����Ǿ��� ������ �Ұ����ϴ�. 
		//j2 ���� �� Jindo �Ӽ� �� Dog�� �Ӽ��� �������Եȴ�.
		System.out.println(((Jindo)j2).color);//�̷��� Jindo�� ����ȯ �� ����� ��밡���ϴ�
		System.out.println(((Dog)j3).name);//Jindo���� Ȯ�� ���־ ���X//�� ��,Dog���� Ȯ�� �� �־����� �̸��� Jindo�� ����Ʈ���̴�.
		//�ٿ�ĳ���� : �� ó�� �ڽ����� ����ȯ �� ���� �ٿ�ĳ�����̶�� �� - ((Jindo)j2).color �� �κ�
		
		
		j3.what();//j3�� �ڷ���: �ֿϵ���(Pet) j3�� ������ü: ������(Jindo)
		//������ �� �ڷ����� Ȯ���Ѵ�.
		//����ɶ��� ���� ��ü�� �޼ҵ尡 ��µȴ�.
		
		//�� "���� ����" & "���� ���߿����� ������" �߿��� ������!�� ��µȴ�!
		
		//�̸� ���� ���ε�(dynamic binding)�̶�� �Ѵ�.  ((12���� PDF P.36����
		//->�޼ҵ尡 ����� �� ���� ��ü�� ����Ǵ� ��
		
		Jindo j4 = new Jindo();
		//System.out.println(j1==j2);System.out.println(j1==j2);//�̷��� �ϸ� �����ڷ����̱� ������ �ּҸ� ���ϹǷ� �翬�� false��� �� ����
		//equals�� ����Ͽ� ����� ����
		System.out.println(j1.equals(j4));//�̷������� �񱳰��� equals�� ������ �ʾƵ� �̹� object Ŭ������ equals�� ǥ�Ե�!!
		//������ objectŬ������ equals�� �׳� == ó�� �ּҰ� �񱳹ۿ� �ȵȴ� �׷��� �ؿ��� �缱�� ����ߵȴ�~
		
		
		Stone st = new Stone();
		System.out.println(j1.equals(st));//�̷��� ���ϸ� �������� �Ǵµ�  �����ϸ� ���� ��
		//equals �޼ҵ� ��ü�� Jindo�� ����ȯ �Ͽ� ���ϴµ� st�� Stone�̹Ƿ� ������礷��
		//�׷��� Jindo�� equals�޼ҵ忡 instanceof�κ��� �߰�����-> false ����� ����
	}
}

class Cat extends Pet{}
class Stone{}

class Pet{
	int age;
	void what(){
		System.out.println("���� ����...");
	}
	Pet(){this(1);}
	Pet(int age){
		this.age= age;
	}
	
	void info(){
		System.out.printf("�� �ֿϵ����� ���̴� %d�̴�.\n",age);
	}
}

class Dog extends Pet{
	String name;
	@Override //������ �ߴٴ� ��
	void what(){
		System.out.println("���� ������!");
	}
	Dog(){//����Ʈ�ε� 0��null�� �α� ���ؼ� �ʱ�ȭ���ܤ�
		this(1,"�ǻ�");
	}
	Dog(int age, String name){
		super(age);// == Pet(age) == super.age=age  == this.age=age
		//���� ����(super(age))���� name�� �ʱ�ȭ���ָ� �켱������ �θ� Ŭ������ ����Ʈ ���� �Ŀ� name �ʱ�ȭ����
		//���� Pet�� ����Ʈ�� ������ �ڵ������� ����Ʈ ������
		//������ ������� ���µ� Pet(int age){...}�� ���� �ʱ�ȭ���ִ°� �ִٸ� ���� ��
		this.name=name;
	}
	
	void info(){
		System.out.printf("�� �������� ���̴� %d�̰�, �̸���%s�̴�.\n",age,name);
	}
	
	
}

class Jindo extends Dog{
	String color;
	@Override
	void what(){
		System.out.println("���� �� �߿����� ������");
	}
	Jindo(){
		this(1,"��������","�Ͼ��");
	}
	Jindo(int age, String name,String color){
		super(age,name);//��� ������ ���� ���� �־�ߵȴ�~
		this.color=color;
	}
	
	void info(){
		System.out.printf("�� �������� ���̴� %d�̰�, �̸���%s�̰�, ������ %s�̴�.\n",age,name,color);
	}
	
	//���̿� �̸�,������ ������ ���� �������� �����ϵ��� equals(Dog d)�޼ҵ� �ۼ��ϱ�
/*	boolean equals(Jindo j){//��� ������ �ƴ϶� �ߺ����Ƕ����//�������̸� equals(object obj)��� ��ߵȴ�.
		if(j.age==this.age&& j.name.equals(this.name)&&j.color.equals(this.color))
			return true;
		else return false;
		
	}�ٵ� �� ����� �����ǰ� �ƴϱ� ������ �����Ƿ� �ٽ��غ���!*/
	public boolean equals(Object o){//������ o == j4��
		if(o instanceof Jindo){// instanceof�� ����� ������ object�� �������� �� ������ ������ false�� �� ����
			return this.age == ((Pet)o).age && this.name.equals(((Dog)o).name) && this.color.equals(((Jindo)o).color);
			//�̷��Ե� �����ѵ��̿��̸� Ȯ���� ��� JindoŬ������ ���ִ°��� ���� -> this.age==((Jindo)o).age ó��
		}
		else return false;
		
	}
	
	
}