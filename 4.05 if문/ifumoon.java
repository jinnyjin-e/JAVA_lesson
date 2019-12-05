import java.util.Scanner;

class ifumoon{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);		
		int input, b=10;
		
	/*	System.out.print("정수 입력: ");
		input = ms.nextInt();
		
		if(input>0)
			b=1;
		else if(input<0)
			b=-1;
		else if(input==0)
			b=0;
			
		//조건문에서 초기화 시에는 else나 default가 꼭 있어야 된다!
		//변수 선언시 초기화 해준다면 else 없어도 된다!!		
		
		System.out.println(b);
	*/	
		int y, m, d=0;
		
		System.out.printf("몇년 : ");
		y = ms.nextInt();
		System.out.printf("몇월 : ");
		m = ms.nextInt();
		
		switch(m){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				d = 31;
				break;
			case 4: case 6: case 9: case 11:
				d=30;
				break;
			case 2:
				if((y%400==0)||((y%4==0)&&!(y%100==0)))
					d=29;
				else
					d=28;
				break;
			default:
				System.out.printf("해당하는 달은 없습니다.");
			
		}
		System.out.printf("%d년 %d월은 %d일까지 있습니다.",y,m,d);
		
		
	}
}