class mthd{
	public static void main(String [] args){//<- main�̶�� �Լ� �̸�: main�� ���ڷ� ���ڿ��� �迭�� ����
						//�żҵ�� Ŭ���� �ȿ� �����ؾ� �ȴ�.
	/*			�������� �ڷ���
���->	static ���������� �޼ҵ��̸� (){
�ٵ�->	
  ���ϵ��	[�Լ��� �����Ϸ��� 'ȣ��'�ؾ��Ѵ�:�Լ��̸�(���ڵ�)]
		return �����;-> return value : ��ȯ��; ?? ���Ҹ�?
		}
	*/	
		
		System.out.println(Math.cos(Math.PI));  //cos(����)ȣ���غ���
  		System.out.println(sum(1,5,9));  //1+5+9 ȣ���غ���
		System.out.println(div(9,5));
		double [] arr = { 1,2,3,4.5}
		summarr(arr);
								//���⼭ 20��°�ٷ� ���� sum �Լ��� ���
	}
	//�Ǽ��� �迭�� �Ű������� �޾� ��� ������ ���� "���"�ϴ� �޼ҵ带 �ۼ��ϰ� �׽�Ʈ
	static void sumarr(double [] a){
//			���ȯ�ϴ� ��ȯ��/��ȯ���� �ڷ��� �� �𸣱⶧����
		double sum=0;
		for(double x : a){
			sum+=x;
		}
		System.out.printf("��� ���е��� ��: %.1f \n",sum);//�����,��ȯ�� �ٸ�
		return; //��� ��� �ȴ�.
	}
	
	//�� ������ �Ű������� �޾� ���� ���� ���� ���� ���� ����� "��ȯ"�ϴ� �޼ҵ带 �ۼ��ϰ� �׽�Ʈ
	static double div(int a, int b){
		return a/(double)b;
	}
	
	//�� ������ �Ű� ������ �޾� �� ���� ���� ��ȯ�ϴ� �޼ҵ带 �ۼ��ϰ� �׽�Ʈ
	static int sum(int a, int b, int c){
		  //�� int : ������� �ڷ���
		return a+b+c;//12°�ٷ� �ٽ� ���ư�
		
	}
	
	
}