class Driver{
	public static void main(String [] args){
		Car mcar = new Car();
		
		mcar.goStraight(25);//mcar���� 25m �̵��϶�� ��û
		mcar.turnLeft();
		mcar.goStraight(30);
		mcar.turnRight();
		mcar.goStraight(15);
		mcar.turnLeft();
		mcar.goStraight(20);
		
		
		System.out.println();
		System.out.println("�� ����Ÿ���"+mcar.getMileage());
		//getMileage�� ������ ��ȣ() ����ߵȴ�. : ???�̱� ������ ;; ���餷�� ��
	}
}

class Car{
	
	private int mileage;
	
	void goStraight(int dist){
		mileage += dist;
		System.out.printf("%dm �����߽��ϴ�.\n",dist);
		
	}
	
	public void turnLeft(){
		System.out.printf("��ȸ�� ��");
	}
	
	public void turnRight(){
		System.out.printf("��ȸ�� ��");
	}

	public int getMileage(){
		return mileage;
	}
	
	
}
