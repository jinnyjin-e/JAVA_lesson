import java.util.Scanner;

class Atoz_1{
	public static void main(String [] args){
		int i;
		for(i=65;i<=90;i++)
			System.out.printf("%c",i);

		System.out.printf("\n");
		
		Scanner ms= new Scanner(System.in);
		int gugu, j;
		
		System.out.printf("¸î ´Ü: ");
		gugu = ms.nextInt();
		
		for(j=1;j<=9;j++){
			System.out.printf("%d X %d = %d\n",gugu,j,j*gugu);
		}
		
		
		
	}
}