class DogTest{
	public static void main(String [] args){
		//������ ����
		Dog happy = new Dog();
		Dog sleepy = new Dog();//��� ���Ƕ� �ٸ��ִ�!<-10���� 2��° ���˹��� 2��!
		//������ ���ǿ� ������(?�ʵ�?)�� ���� ������ �޼ҵ忡 ���� �ൿ�� �Ȱ����ؾ��Ѵ�
			
		//happy : ������ ��ü, �ν��Ͻ�
		//Ŭ������ ���赵�̰� ��ü�� ������ ������� ����
		
		//�翬�ϰԵ� happy�� ���������̴� ������;
		//������ �������� heap�� ����ǰ� happy�� �ּڰ��̴�.
		//heap�ȿ� �ִ� happy�� �ȿ� full name ����� ��� ����
		
		sleepy = happy;// �䷸�ԵǸ� �������� �ּڰ��� ���ǿ� ������ ������
		//������ ������ ���� �� (����)�����Ǿ��� �������� ���߿� garbage collector�� �Ҹ��Ŵ������
		sleepy = null;
		//�̷��� �ع����� ������ �Ҹ�ȴ�...
		
		
		//�������� ������ ���
	/*	������ �Ʒ�ó�� ���������� private�ٿ��༭ ���� ����... �׷��� �ؿ� ��ü��� ����
		System.out.println(happy.full);
		
		System.out.println(happy.name);
		
		happy.full = 100; //������ �̷������� ������ ���������ϴ�!
	*/	
		//�׷��� ���� Ŭ������ private�ٿ��༭ ���� ����(����) �Ұ���
		//���� �㲨�� ���� ��
		//�ٵ� ������ �ƴ϶� ���� ��ü�� �Ұ�����;; �Ф�
		//�� Ȯ�ε� �Ӵ� �Ф� -> dogŬ������ gettet ����..
		
		System.out.println(happy.getFull());
		
		happy.setName("����");
		System.out.println(happy.getName());

		happy.setName("�ؾ֤��־־־֤�����������222222!!!~~~");
		System.out.println(happy.getName());

		
		if(happy.getFull()<5) happy.eat(0);
		else happy.play();
		
		if(happy.getFull()<5) happy.eat(6);
		else happy.play();
	}
	
	
}
