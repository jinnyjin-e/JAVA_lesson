import java.util.Scanner;

class square{
	public static void main(String [] args){
		int i,j, line;
		String n;
		Scanner ms = new Scanner(System.in);
		
		System.out.printf("");
		System.out.printf("");
		//���α׷��� ��� ����?? no �Է� �� ���α׷� ����, �̿��� ��-> ��� ����?
		System.out.print("���α׷��� ��� ����? ");
		n = ms.next();
		if(n.equals("no")) System.exit(0);//return;
		//return�� return�� ��ġ�� �޼ҵ�(~=�Լ�) ����
		//������ ���� main()�� ����-> main�� ����Ǹ� ���α׷� ����
//system.exit(����)�� �� ���α׷� ��ü�� �����Ŵ
		
		System.out.print("���� ��: ");
		line =ms.nextInt();
		
		
		for(j=1;j<(line+1);j++){
			for(i=1;i<11;i++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	/*	int k;
		for(j=1;j<6;j++){
			for(i=1;i<6;i++){
				System.out.print(" ");
			}
			for(k=5;k<6&&0<k;k--){
				System.out.print("*");
			}
		}*/
	}
}	