import java.util.Scanner;

class ifmoon{
	public static void main(String [] args){
		int n;
		Scanner ms = new Scanner(System.in);
		
		//점검문제1-1
		System.out.print("n값 입력: ");
		n = ms.nextInt();
		
		if(n>=100) System.out.println("large");
		else System.out.println("small");
		// else 대신에 다시 if문을 써서 if(n<100)~~~~  나타내도 된다.
		
		
		//점검문제1-2
		int c;
		
		System.out.print("c값 입력: ");
		c = ms.nextInt();
		
		if(c<100)
			System.out.print("small");
		else if(c<200)
			System.out.print("medium");
		else
			System.out.print("large");
		/*위의 식은
		if(c<100)
			System.out.print("small");
		else {
			if(c<100)
			System.out.print("medium");
			else
			System.out.print("large");
		}로 나타낼수도 있다.
		*/
		
		//Nested if문		
		
	}
	
}