// ����ó���� ���� ����2			 //8��
//1 2 3 .. 10 ���� 10�� �������� ����ϴ� �޼ҵ� printNum()  


class printdelay{
	public static void main(String [] args)/*throws InterruptedException*/{
		//printNum()���� �ѱ� ���ܸ� main���� ���ѱ�
		//���� ����ó���ϴ��� throws �� �� ����
		
		try{
			printNum();
		}catch(InterruptedException ie){
			System.out.print("Thread���� ���� �߻�");
		}
	}
	
	static void printNum()throws InterruptedException{//1)main���� ���� ���ѱ�
		for(int i =1 ; i<11; i++){
			System.out.print(i+" ");
			//try{
			Thread.sleep(1000);
		/*	}catch(InterruptedException ie){
				System.out.print("Thread���� ���� �߻�");
			}*/
			
		}
		System.out.println();
	}
}