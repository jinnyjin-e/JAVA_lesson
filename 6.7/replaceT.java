/*							//5��->4����¦ �ٲ��ڵ�
	CMD ->  java replaceT �������� ��ü���� ���ܾ� �Ŵܾ�
	: ���� ���Ͽ��� ���ܾ �߰ߵǸ� �Ŵܾ�� ��ü�ؼ� ��ü���� ���� ����
*/

//java replaceT eatTest.java replaceee.java System.out. Hello
// eatTest�� ���� �� 'System.out'�� ������ 'Hello'�� �ٲٴ� �ڵ� ������

/*
		"Hello, java! Hello wolrd" ���� -> hello�� HELLO�� ����
		String st1 = "Hello, java! Hello wolrd";
		String st2 = st1.replaceAll("Hello","HELLO");
		System.out.println(st2);
		substring() length() charAt()��� �ٽ� �����ϱ�
*/

import java.util.*;
import java.io.*;

class replaceT{
	public static void main(String [] args)throws Exception{
				
		
		File f1 = new File(args[0]);//����
		File f2 = new File(args[1]);//���纻
		
		if(args.length<4){
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
			pw.printf("%s \r\n",ms.nextLine().replaceAll(args[2],args[3]));
		}
			
		pw.close();
		ms.close();//��ĳ�ʵ� ������ ����
		
		System.out.print("����Ϸ�!");
	}
}