class DogTest{
	public static void main(String [] args){
		//강아지 생성
		Dog happy = new Dog();
		Dog sleepy = new Dog();//얘랑 해피랑 다른애다!<-10주차 2번째 점검문제 2번!
		//각각의 해피와 슬리피(?필드?)는 별개 하지만 메소드에 의한 행동은 똑같이해야한다
			
		//happy : 강아지 객체, 인스턴스
		//클래스는 설계도이고 객체는 실제로 만들어진 것임
		
		//당연하게도 happy는 참조변수이다 ㅇㅇㅇ;
		//실제로 강아지는 heap에 저장되고 happy는 주솟값이다.
		//heap안에 있는 happy값 안에 full name 등등이 모두 존재
		
		sleepy = happy;// 요렇게되면 슬리피의 주솟값이 해피와 같아짐 ㅇㅇㅇ
		//기존의 슬리피 선언 시 (힙에)생성되었던 정보들은 나중에 garbage collector가 소멸시킴ㅇㅇㅇ
		sleepy = null;
		//이렇게 해버리면 슬리피 소멸된다...
		
		
		//강아지의 포만감 출력
	/*	원래는 아래처럼 가능했지만 private붙여줘서 이제 못씀... 그래서 밑에 대체방안 적음
		System.out.println(happy.full);
		
		System.out.println(happy.name);
		
		happy.full = 100; //원래는 이런식으로 포만감 조정가능하다!
	*/	
		//그래서 뒤의 클래스에 private붙여줘서 이제 조정(수정) 불가능
		//오류 뜰꺼임 이제 ㅋ
		//근데 수정이 아니라 접근 자체가 불가능함;; ㅠㅠ
		//값 확인도 앙댐 ㅠㅠ -> dog클래스에 gettet 써줌..
		
		System.out.println(happy.getFull());
		
		happy.setName("해피");
		System.out.println(happy.getName());

		happy.setName("해애ㅐ애애애애ㅐㅐㅐㅐㅐ삐222222!!!~~~");
		System.out.println(happy.getName());

		
		if(happy.getFull()<5) happy.eat(0);
		else happy.play();
		
		if(happy.getFull()<5) happy.eat(6);
		else happy.play();
	}
	
	
}
