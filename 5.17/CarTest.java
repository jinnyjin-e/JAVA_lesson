//�ٸ� �ڵ��� �ڵ� �ϳ� ����ǵ� Ŭ���� �̸��� �ٸ��� �ϰų� �ٸ� ������ �ؾߵȴپƤ�������
class CAR{
	//�ʵ�: ����,����Ÿ�,�������� ������ �ڵ����� ���
	//������: ����Ʈ ������, ����� ����Ÿ��� �ʱ�ȭ�ϴ� ������
	//��, ����Ʈ �����ڴ� ����Ÿ��� 1�� �Ķ��� �ڵ����� ����
	String color;
	double dist;
	static int cnt=0;
	
	CAR(String color, double dist){
		this.color = color;
		this.dist = dist;
		cnt++; //�ʵ�� ���������� �����ԵǹǷ� c1�� 1 ,c2�� 1, c3��1 �� ���� ����ȴ�. �׷��� ������ static�� �ٿ��ָ� cnt�ʵ�°����ȴ�.
	}//����� ����Ÿ��� �ʱ�ȭ�ϴ� ������
	
	CAR(){
		this("�Ķ���",1);
	}//����Ʈ ������ <-�Ķ����̸鼭 ����Ÿ��� 1�� �ڵ�����
	
	void tellColor(){
		System.out.println("�� ������ "+color);
	}
	
}
//�żҵ忡�� static�� �ٴ´� => �żҵ��� ����� ��ü�� �������϶� static�� ���δ�.
//���� �����ϸ� ����� ���ϸ� �ȵǴ°͵��� static�ٿ���. ex)cos(0)���� ����
class CarTest{
	public static void main(String [] args){
		CAR c1 = new CAR();
		CAR c2 = new CAR("������",100);
		CAR c3 = new CAR();
		System.out.println("�������� "+CAR.cnt+"�� �������");
		//c1.cnt�� ������ �ƴ϶� CAR�� cnt�� �����ϰ� �����Ƿ� CAR.cnt�� ����
		//��ü.��� �� �ƴ϶� Ŭ����.��� �� ���·� ����
		
		c1.tellColor();
		c2.tellColor();
		
	}
}