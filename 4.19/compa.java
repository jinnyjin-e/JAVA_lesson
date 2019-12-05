import java.util.Scanner;

/*
		1.���ڿ� ���� ��: ���ڿ�1.equals(���ڿ�2)   //�����:T or F
			ex)"abc".equals("ABC") 		=>���:False
			
		2.���ڿ� ��ҹ��� �����ϰ� ���� ��: ���ڿ�1.equalsIgnoreCase(���ڿ�2)
			ex)"abc".equals("ABC") 		=>���:True
		
		3.���ڿ� �� : ���ڿ�1.compareTo(���ڿ�2) //�����:����(���ڿ�1-���ڿ�2)
			ex) "abc".compareTo("adfcd")	=>��� -2 (= b-d)
				a,a����->b,d�ٸ�!->���⼭ �� ��!(�� �ڴ� �Ű�X)
			ex) "abc".compareTo("abfcd")	=>��� -3 (= c-f)
				a,a����->b,b����->c,f�ٸ�
				
			ex2) String a= "ab", b="cd"
			a.compareTo(b); //���: -2
			a.compareTo("ab")//0
			a.compareTo("abc")//-1 : �񱳰����Ѱ��� �� ���� ���ʿ� ���� �� ����-> ����
			"abcd".compareTo("abc")//1 : �񱳰����Ѱ��� �� ���� ���ʿ� ���� �� ����-> ���
		
		4."abc".compareTo
		
		5.���ڿ����� �ܾ� ��ü: ���ڿ�.replaceAll(���ܾ�, �Ŵܾ�) 
			ex)	s = "HELLO, WORLD! HELLO,JAVA!".replaceAll("HELLO","Hello");
				s = "Hello, WORLD! Hello,JAVA!" <- �빮���� ��ΰ� �ҹ��ڰ� �Ǿ���
			
			//�׳� replace �Լ��� ����(%c)�� �ٲ� :replaceAll���� �ѱ��ڸ� �ٲٴ°Ŷ� ����X
		*/

class compa{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		//���������� �����ϱ�
		//compareTo �Լ� ����ؼ� ���� ������ �ٲ��ʿ� X ex)
		//��� ������ �ٲ�� �ȴ� ex) "xyz".compareTo("abc") ��� �����->abc�� ������ ������
		String tmp;
		//args �迭�� ����(���Ұ���)
		//args �迭�� ù��? ����(���ڿ�)�� ����
		for(int i=0;i<(args.length-1);i++){
			for(int j=i+1;j<args.length;j++){
				if(args[i].compareToIgnoreCase(args[j])>0){
					tmp=args[i];
					args[i]=args[j];
					args[j]=tmp;
				}
			}
		}
		for(int k=0;k<args.length;k++){
			System.out.print(args[k]+" ");
		}
		//args �迭�� ����(���Ұ���)
		//args �迭�� ù��? ����(���ڿ�)�� ����
		//�� �ڵ�¥��(������ ��)
		
		System.out.printf(args.length); 
		System.out.printf(args[0].length()); 
		
		//������������
		
	}
}



