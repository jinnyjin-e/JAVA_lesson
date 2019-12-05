// 먹이 갯수를 매개변수로 받는 eat() 메소드
// 먹이를 매개변수로 받는 eat() 메소드 =>ex) myDog.eat("아이스크림");
		//<-중복정의 해보기

class Dog{
	int full;
	String name;
	String type;
	double height;
	double weight;
	
	void eat(int food){
		full += food;
		System.out.println("맛있네용. ");
	}
	void eat(String food){
		full += 10;
		System.out.println(food+"가(이) 맛있네용. ");
	}
	//똑같이 eat형식으로 중복정의했다.
	
	
	//객체를 만들었는데 객체의 성질(이름,타입,타입 등등의 값들이)이 하나도 없음(Null) 또는 모두 같음
	//->그래서 생성자를 만든다.

	//생성자(constructer): 객체를 생성 할 대, 필드값을 초기화하는 특별한 메소드
/*		1. 객체 생성할 때 딱 한번 호출된다. 
		2. 반환타입이 없다. (void도 아님!@!@!@)
		3. 메소드이름 == 클래스이름
		
		ex) Scanner ms = new Scanner() 에서 Scanner()가 생성자임 => 디폴트 생성자 호출임
		생성자를 하나도 작성하지 않았다면 디폴트 생성자 자동으로 만들어줌
		ex2) Dog myDog = new Dog();요기에서도 디폴트 생성자 만들어줌
*/   
	//이름과 몸무게를 초기화하는 생성자 작성하기
	Dog(String name, double weight)	{
		if(name.length()<10) this.name = name; //앞의 name은 선언한 name이고, 뒤의 name은 Dog함수 안의 name임
		else this.name = "뽀삐";

		if(weight<=50 &&weight>0) this.weight = weight;
		else this.weight = 15;
		
	}
	//이름과 종,몸무게,키를 초기화하는 생성자 작성하기(중복정의로)

	Dog(String name, String type, double weight, double height)	{
		//위의 Dog함수에서 중복되는 부분은 복붙 하는것보다 호출하는것이 훨~신 낫다
		
		this(name,weight);//요렇게 이름이랑 몸무게 불러와서 저장함 this뒤에 다른 생성자를 호출한다?라고함(뭔소리지)
		//생성자 내부에서 다른 생성자 호출 가능
		//단, 함수의 맨 첫째라인에서만 가능!
		
		this.type = type;
		
		if(height<=100 && height>0) this.height = height;
		else this.height = 30;
		
	}

	
	//객체 정보를 "모두" 반환하는 메소드: toString() 메소드
	//문자열 형태로 반환한다
	public String toString(){//얘는 무조건 public 붙어야된다. 고 한다.
		//return "포만감: "+full+", 이름: "+name+", 종: "+type+", 키: "+height+", 무게: "+weight;
		//이 방법마저 + 랑 " 을 계속 쓰기 귀찮아서 format사용함
		return String.format("포만감: %d, 이름: %s, 종: %s, 키: %.1f, 무게: %.1f",full,name,type,height,weight);//포맷 앞에 스트링 붙임으로 인해 이런 문자열을 구성하여 리턴하겠다~ 라는 뜻
	}
	
	
}

class I{
	public static void main(String [] args){
		Dog myDog = new Dog("개똥이",17);
		Dog yourDog = new Dog("귀여운둘리는외로운아기공룡","티라노사우루스",1000,120);
/*		
		System.out.printf("나의 강아지: %s %s %.2f %.2f \n", myDog.name, myDog.type, myDog.weight, myDog.height);
		System.out.printf("나의 강아지: %s %s %.2f %.2f \n",yourDog.name,yourDog.type,yourDog.weight,yourDog.height);//이렇게 일일이 치기 귀찮아서 toString메소드 만들어서 사용함 ㅇㅇ
		*/
		System.out.println();
		System.out.println(myDog.toString());
		System.out.println(yourDog);
		//객체 참조변수를  출력하라고 요청하면 자동적으로 toString()메소드를 호출하여 그 결과가 출력됨
		//굳이 yourDog.toString() 이라고 쓸 거 없이 그냥  yourDog라고 써도 된다는 말임 ㅇㅇㅇ
		
		myDog.eat(10);
		myDog.eat("아이스크림");
		
	}
}