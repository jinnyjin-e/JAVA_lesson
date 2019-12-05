//이 강아지의 포만감이 5 이상이면 놀아주고, 아니라면 먹이를 준다.
//클래스 -> 설계도 의 의미
public class Dog{
//필드, 메소드 :클래스 멤버
//필드 	- 멤버 변수
//메소드 	- 멤버 함수 
	
	//필드 :클래스 내부에 존재(메소드 내부가 아님)
	//지역변수: 매소드 내부에 존재
	//필드는 초기화하지 않는다면 자료형에 맞는 0 으로 자동 초기화
	
	private String name; //강아지 이름
	private int full; //포만감
	
	//필드의 경우 private 붙일 수 있음
	//dog클래스 밖에서는 이제full값 조정 불가능@@@/참조도 불가능(값 확인)
	//엥간하면 필드의 값들은 외부에서 변경 불가능하도록 private 붙이라함
	
	//private한 필드에 대한 gettet() 를 작성! 
	//-> private한 필드값을  "확인"시켜주는 메소드임 ㅎ

	int getFull(){//메소드이기때문에 무.적.권 자료형 적어줘야된다.
		return full;
	}
	String getName(){//얘도 private 붙여줬기 때문에 만들어줘야댐
		return name;
	}
	
	//private한 필드의 값을 "변경"하는 메소드 setter()를 작성!
	//set필드명() 의 형태임
	void setName(String name){
		//만약 변경하려는 이름의 길이가 10보다 작다면 허용
		//이름의 길이가 10 이상이라면 "개똥이"로 설정
		if(name.length()<10) this.name = name ;// 이(this) 객체의 name을 매개변수 name으로 받는다
		else this.name = "개똥이";// 여기의 name은 SetName(String name)의 name이다.return;
	}
	
	
	
	
	//메소드
	void eat(int food){//food개의 먹이를 먹는 행동
		if(food>0){
			full += food;
		
			System.out.printf("먹이를 %d개 먹었더니 배부르네요 ^______^ \n",food);
		}
		else{
			System.out.printf("먹이를 주세요 '____' \n");
		}
	}
	
	void play(){//노는 행동
		System.out.printf("엌ㅋㅋ재밌당ㅋㅋㅋ ^ ㅁ ^ ");
	}
}