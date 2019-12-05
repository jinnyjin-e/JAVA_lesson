class Driver{
	public static void main(String [] args){
		Car mcar = new Car();
		
		mcar.goStraight(25);//mcar에게 25m 이동하라고 요청
		mcar.turnLeft();
		mcar.goStraight(30);
		mcar.turnRight();
		mcar.goStraight(15);
		mcar.turnLeft();
		mcar.goStraight(20);
		
		
		System.out.println();
		System.out.println("총 주행거리는"+mcar.getMileage());
		//getMileage에 무조건 괄호() 써줘야된다. : ???이기 때문에 ;; 못들ㅇ므 ㅠ
	}
}

class Car{
	
	private int mileage;
	
	void goStraight(int dist){
		mileage += dist;
		System.out.printf("%dm 직진했습니다.\n",dist);
		
	}
	
	public void turnLeft(){
		System.out.printf("좌회전 후");
	}
	
	public void turnRight(){
		System.out.printf("우회전 후");
	}

	public int getMileage(){
		return mileage;
	}
	
	
}
