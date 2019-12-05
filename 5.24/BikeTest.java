import java.util.Scanner;

class BikeTest{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int soo;
		String color;
		
		System.out.print("������ ���� ��: ");
		soo = ms.nextInt();
		ms.nextLine();
		
		System.out.print("������ ����: ");
		color = ms.nextLine();
		
		Bike b1 = new Bike(soo,color);
		
		System.out.printf("\n[������ ����]");
		System.out.print(b1);
		
		
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		Bike b4 = new Bike();
		Bike b5 = new Bike(2,"�Ķ���");
		
		System.out.println("������ ��� �� ���� �Ϸ�");
		System.out.printf("�������� ������ �����Ŵ� %d�� �Դϴ�.",Bike.cnt);
		
	}
}
class Bike{
	private int soo;
	private String color;
	static int cnt=0;
	
	Bike(){
		this(2,"�Ķ���");
	}
	Bike(int soo,String color){
		setSoo(soo);
		setColor(color);
		cnt++;
	}

	void setSoo(int soo){
		if(soo>=1 && soo<=10) this.soo = soo;
		else this.soo = 2;
	}
	void setColor(String color){
		this.color = color;
	}
	public String toString(){
		return String.format("\n������ ���� ��: %d, ����: %s \n\n",soo,color);
	}
}