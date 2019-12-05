
class Dog{
	int age;
	String name;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//�������� ��� ������ ��ȯ�ϵ��� ������
	public String toString(){//public �־�� �Ǵ� ����: �θ�Ŭ�������� public���� �������־(object �޼ҵ忡�� public���� ����Ǿ����� �װ� �ڽĸ޼ҵ��� Dog���� ���°Ű�)
	// �θ��� �������� �� ���� ������ ������ �Ұ���
		//�� �θ�:public �ڽ�:public ����, �θ�:protected �ڽ�:public ����, �θ�:public �ڽ�:protected �Ұ���
		return String.format("���� : %d, �̸�: %s",age,name);
	}
	//equals() �żҵ� : �̸��� ���̰� ���ٸ� ���� �������� �������ϴ°�
/*	public boolean equals(Dog d){
		return ((this.age == d.age) && (this.name.equals(d.name)));
		//d.equals(d2) �̹Ƿ�  this.age�� age�� d�� ����, d.age�� age�� d2�� ������
		//�� �������� ��ȯ�ȴ�.
		//�䷸���ϸ� �ߺ������� �����̰� �ƴ϶� �Ʒ����� ��������
	}
	*/
	public boolean equals(Object o){
		return ((this.age == ((Dog)o).age) && (this.name.equals(((Dog)o).name)));
		//�̿ϼ��� -������ �Ŀ� ����� ������
	
	}
}
class DogTest{
	public static void main(String [] args){
		Dog d = new Dog("�ٵ���",10);
		Dog d2 = new Dog("������",10);
		System.out.print(d.equals(d2));
		
//		Bike b = new Bike();
		Animal a = new Animal();

		System.out.println(d);
		
		//getClass ����غ���
		System.out.println(a.getClass());//a�� ���� Ŭ���� ������
		System.out.println(a.getClass().getName());//a�� ���� Ŭ������ �̸��� ������
		
	}
}