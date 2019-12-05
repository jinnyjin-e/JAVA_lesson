class MethodTest1{
	public static void main(String [] args){
		
		sum(2,3);
		sum(2,3,4);
		sum(1,23,34,56,89,78,123,456,789);
		
		
	}
	static void sum(int ... x){//받는 정수의 갯수 모를 때
		//이렇게 해버리면 정수를 여러개(정해지지 않음) 받아서 합을 구할 수 있음
		//이런거를 [가변길이인수 method]라고 함
		int s = 0;
		for(int elt:x){
			s+= elt;
		}
		System.out.println(s);
	}
	//정수 두 개의 합 출력하는 메소드
	//정수 세 개의 합 출력하는 메소드
	//정수 네 개의 합 출력하는 메소드
	//...
	//정수 100개의 합 출력하는 메소드	를 어떻게 만들 수 있을까
	
	/*아래 방법 말고 위의 방법 사용
	static void sum(int a, int b){//main이 포함된 함수가 하나밖에 없을때는 static을 붙여줌(?? 뭔솔..?)
		System.out.println(a+b);
	}
	static void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	*/
}