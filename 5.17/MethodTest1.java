class MethodTest1{
	public static void main(String [] args){
		
		sum(2,3);
		sum(2,3,4);
		sum(1,23,34,56,89,78,123,456,789);
		
		
	}
	static void sum(int ... x){//�޴� ������ ���� �� ��
		//�̷��� �ع����� ������ ������(�������� ����) �޾Ƽ� ���� ���� �� ����
		//�̷��Ÿ� [���������μ� method]��� ��
		int s = 0;
		for(int elt:x){
			s+= elt;
		}
		System.out.println(s);
	}
	//���� �� ���� �� ����ϴ� �޼ҵ�
	//���� �� ���� �� ����ϴ� �޼ҵ�
	//���� �� ���� �� ����ϴ� �޼ҵ�
	//...
	//���� 100���� �� ����ϴ� �޼ҵ�	�� ��� ���� �� ������
	
	/*�Ʒ� ��� ���� ���� ��� ���
	static void sum(int a, int b){//main�� ���Ե� �Լ��� �ϳ��ۿ� �������� static�� �ٿ���(?? ����..?)
		System.out.println(a+b);
	}
	static void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	*/
}