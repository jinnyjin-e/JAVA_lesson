/*							//4��
	���� ���� ���α׷�
		CMD -> java copyTest�������� ���纻����
	1.Ŀ�ǵ���ο��� �������� ���纻���ϸ��� �޴´�
	2.Ŀ�ǵ���ο����� 2���� �Էµ��� �ʴ´ٸ� ���� �˸��� ���α׷� ����
	3.���������� ���ٸ� ���α׷� ����
	4.���纻������ �̹� �����Ѵٸ� �̸� �˸���(���������ʰ�) ���α׷� ����
	5.���������� �����Ͽ� ���纻�� �����ϰ� �ܼ�â�� ����Ϸ��� ����ϱ�
	
*/
//String Ŭ���� �żҵ�� ����Ǽ� ���´ٰ��� ���迡


import java.util.*;
import java.io.*;

class copyT{
	public static void main(String [] args)throws Exception{
		
		File f1 = new File(args[0]);//����
		File f2 = new File(args[1]);//���纻
		
		if(args.length<2){
			System.out.print("[����] ����: �������� ���纻����");
			return;
		}
		if(f1.exists()==false){
			System.out.print("[����] �������� �������� ����");
			return;
		}
		if(f2.exists()==true){
			System.out.print("[����] �̹� ���纻 ���� ����");
			return;
		}
		
		Scanner ms = new Scanner(f1);//�������� �ҷ���
		PrintWriter pw = new PrintWriter(f2);//���纻�� ��
				
		
		while(ms.hasNext()==true){
			//pw.printf(ms.nextLine()+"\r\n"); ��� �ϸ� ���� �Ǿ�� �ϴµ� �ȵǴ� ��� �Ʒ�ó�� ����� �Ѵ�
			pw.printf("%s \r\n",ms.nextLine());
		}
			
		pw.close();
		ms.close();//��ĳ�ʵ� ������ ����
		
		System.out.print("����Ϸ�!");
	}
}