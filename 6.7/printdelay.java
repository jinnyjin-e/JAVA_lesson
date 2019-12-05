// 예외처리를 위한 예제2			 //8번
//1 2 3 .. 10 까지 10초 간격으로 출력하는 메소드 printNum()  


class printdelay{
	public static void main(String [] args)/*throws InterruptedException*/{
		//printNum()에서 넘긴 예외를 main에게 떠넘김
		//직접 예외처리하던가 throws 쓸 수 있음
		
		try{
			printNum();
		}catch(InterruptedException ie){
			System.out.print("Thread에서 오류 발생");
		}
	}
	
	static void printNum()throws InterruptedException{//1)main에게 오류 떠넘김
		for(int i =1 ; i<11; i++){
			System.out.print(i+" ");
			//try{
			Thread.sleep(1000);
		/*	}catch(InterruptedException ie){
				System.out.print("Thread에서 오류 발생");
			}*/
			
		}
		System.out.println();
	}
}