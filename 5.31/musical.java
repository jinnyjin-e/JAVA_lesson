/*Ŭ���� 
	-������
		direct(�����ڵ�) => �� �����ڵ鿡�� ���ֽ�Ŵ
	�Ʒ� Ŭ�������� play()�޼ҵ带 ����
	-�ǾƴϽ�Ʈ
		play() : �ǾƳ븦 �����մϴ�
	-ÿ����Ʈ
		play() : ÿ�θ� �����մϴ�
	-���̿ø��Ͻ�Ʈ
		play() : ���̿ø��� �����մϴ�
	
	-�׽�Ʈ Ŭ����
		������ �Ѹ�� ������ ��� ����,
		�����ڰ� �����ڵ鿡�� �����ϴ°��� �׽�Ʈ
*/
/*final - ���� 	: ���ȭ
		- �޼ҵ�	: ������ �Ұ�
		- Ŭ���� 	: ��� �Ұ�
*/
class musical{
	public static void main(String [] args){
		Maestro m = new Maestro();
		player [] players = {new �ǾƴϽ�Ʈ(), new ÿ����Ʈ(), new ÿ����Ʈ(), new ÿ����Ʈ(), new ���̿ø��Ͻ�Ʈ(), new ���̿ø��Ͻ�Ʈ(), new ���̿ø��Ͻ�Ʈ(), new ���̿ø��Ͻ�Ʈ()};
		//����� ����: ���� �ٸ� �ڽ� Ŭ������ ��ü���� �θ�Ŭ������ ��ü���� �迭�� �׷��� �� �� ���� ����
	
		/*������
		�ǾƴϽ�Ʈ p1 = new ...
		ÿ����Ʈ c1 = new ..
		�̷� �����̾��µ� ���� �ڷ����� player�� �� �� ���� 
		-> �׷��� ��� ���� �ڷ����̹Ƿ� �迭�ε� ����!!!->����� ����2��
		player p1 = new �ǾƴϽ�Ʈ();
		player c1 = new ÿ����Ʈ();
		player c2 = new ÿ����Ʈ();
		player c3 = new ÿ����Ʈ();
		player v1 = new ���̿ø��Ͻ�Ʈ();
		player v2 = new ���̿ø��Ͻ�Ʈ();
		player v3 = new ���̿ø��Ͻ�Ʈ();
		player v4 = new ���̿ø��Ͻ�Ʈ();*/
		
		m.direct(players);
		
	}
}
class Maestro{
	void direct(player [] players){//��ȣ�ȿ� �迭�� ����
		for(player p :players){
			p.play();
		}
	}
	
}
class player{
	void play(){
	}
}

class �ǾƴϽ�Ʈ extends player{
	@Override
	void play(){
		System.out.println("�ǾƳ븦 �����մϴ�.");
	}
}

class ÿ����Ʈ extends player{
	@Override
	void play(){
		System.out.println("ÿ�θ� �����մϴ�.");
	}
}

class ���̿ø��Ͻ�Ʈ extends player{
	@Override
	void play(){
		System.out.println("���̿ø��� �����մϴ�.");
	}
}