//Thread
//1부터 10까지 수 출력하기

class ThreadTest{
	public static void main(String [] args) throws Exception{
		// Thread를 쓰면 throws Exception을 꼭 써야된다. 직접적으로 안 쓰더라도 print메소드를 통해 사용하게 된다면  main 함수에도 써야된다.
		print();
	}
	static void print() throws Exception{
		for(int i = 1; i >0;i++){
			
			if(i<60)System.out.print(i+"초  ");
			else if(i%60==0) System.out.print((i/60)+"분  ");
			else System.out.print((i/60)+"분 "+(i%60)+"초  ");
			
			Thread.sleep(1000);//괄호 안의 시간동안 시간지연 가짐/단위: ms -> 1초 쉴려면 1000넣음
		}
	}
}

