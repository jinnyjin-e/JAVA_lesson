import java.util.Scanner;

class BikeTest{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int soo;
		String color;
		
		System.out.print("자전거 바퀴 수: ");
		soo = ms.nextInt();
		ms.nextLine();
		
		System.out.print("자전거 색상: ");
		color = ms.nextLine();
		
		Bike b1 = new Bike(soo,color);
		
		System.out.printf("\n[자전거 정보]");
		System.out.print(b1);
		
		
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		Bike b4 = new Bike();
		Bike b5 = new Bike(2,"파란색");
		
		System.out.println("자전거 몇대 더 생성 완료");
		System.out.printf("이제까지 생성된 자전거는 %d대 입니다.",Bike.cnt);
		
	}
}
class Bike{
	private int soo;
	private String color;
	static int cnt=0;
	
	Bike(){
		this(2,"파란색");
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
		return String.format("\n자전거 바퀴 수: %d, 색상: %s \n\n",soo,color);
	}
}