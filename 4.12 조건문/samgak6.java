import java.util.Scanner;

class samgak6{
	public static void main(String [] args){
		int i,j,k;
		
		for(j=1;j<6;j++){//¿À¸¥ÂÊ »ï°¢Çü
			for(i=5;i>j;i--)
				System.out.print(" ");
			for(k=0;k<j;k++)
				System.out.print("*");
		System.out.print("\n");
		}
		System.out.print("------------\n");
		for(j=1;j<6;j++){//¿ÞÂÊ »ï°¢Çü
			for(i=0;i<j;i++)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.print("------------\n");
		for(j=1;j<6;j++){//¿ª»ï°¢Çü
			for(i=6;i>j;i--)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}