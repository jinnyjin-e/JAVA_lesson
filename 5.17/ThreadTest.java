//Thread
//1���� 10���� �� ����ϱ�

class ThreadTest{
	public static void main(String [] args) throws Exception{
		// Thread�� ���� throws Exception�� �� ��ߵȴ�. ���������� �� ������ print�޼ҵ带 ���� ����ϰ� �ȴٸ�  main �Լ����� ��ߵȴ�.
		print();
	}
	static void print() throws Exception{
		for(int i = 1; i >0;i++){
			
			if(i<60)System.out.print(i+"��  ");
			else if(i%60==0) System.out.print((i/60)+"��  ");
			else System.out.print((i/60)+"�� "+(i%60)+"��  ");
			
			Thread.sleep(1000);//��ȣ ���� �ð����� �ð����� ����/����: ms -> 1�� ������ 1000����
		}
	}
}

