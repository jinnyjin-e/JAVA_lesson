/*Ŭ����
	-�� : eat()�޼ҵ� ->�ܹ��Ÿ� �ָ��� �ܹ��Ÿ� �Խ��ϴ�.
	-�ܹ���
	-���̽�ũ��
	-����
	-���
*/
//����� ����: �޼ҵ� �ۼ��� �ŰԺ����� �θ�Ÿ������ �ϸ� �ڽ�Ŭ���� ��ü�� ��� ���� �� �ִپƤ�����
class eatTest{
	public static void main(String [] args){
		I i = new I();
		Hamberger h = new Hamberger();
		Icecream ice =new Icecream();
		���� �� = new ����();
		
		
		i.eat(h);//��½� �ܹ��Ÿ� �Դ´� ���
		i.eat(ice);
		i.eat(��);
		i.eat(new ���());//�̷��� �ص� �ȴ�~
		i.eat(new Stone());
		
	}
}
class I{
	void eat(Object o){//�̷��� �ص� �ȴ��� Food Ŭ���� �ϳ� ���� eat(Food f) �ϴ°� ���� �� ���ٰ� �Ͻ�
	// �� �� �԰� �ϱ� ���ؼ� Object�� �ް� instanceof�� ������ش�.
		if(o instanceof Food) System.out.printf("���� %s�� �Խ��ϴ�.\n",o.getClass().getName());
		else System.out.printf("���� ��� �Գ�...");
	}
	
	void eat(Food f){//�� �ȸ԰� �ϴ°Ÿ� ���� �� ����...��
		System.out.printf("���� %s��(��) �Խ��ϴ�.\n",f.getClass().getName());
		//Food���� getClass�� �ߴµ� Food�� �ƴ� Hamberger���� ��µ� ���� �������ε��� �Ͼ�� �����̴�. ��������
		
	}
}
class Stone{}
class Food{}
	
class Hamberger extends Food {}//I�� ���� �� �ʿ� ����
class Icecream extends Food {}
class ���� extends Food {}
class ��� extends Food {}
