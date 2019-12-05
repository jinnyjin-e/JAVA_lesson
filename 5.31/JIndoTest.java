class JindoTest{//지난시간 리뷰 느낌으로다가 함ㅎ 1번
	public static void main(String [] args){
		Jindo j1 = new Jindo();//j1의 자료형은 'Jindo'이다 라고 생각해주면 편하다~
		Dog j2 = new Jindo();//어떤 진돗개를 만들었는데 얘는 강아지이다 <-말이되네? 그럼 함수적으로도 말이된다 (상속관계이기 때문에 가능)
		Pet j3 = new Jindo();//이 경우도, 어떤 진돗개를 만들었는데 얘는 애완동물이다 : 말이된다
							//j2,j3의 경우 -> 업캐스팅 이라고 함 : 캐스팅-형변환 의 뜻을 가짐
		//다형성(polymorphism): 하나의 객체를 여러 자료형으로 선언 할 수 있는 것
		
	//	Cat j4 = new Jindo();//이 경우는 상속계열이 다르기 때문에 얘는 불가능 함
		
		//업캐스팅의 한계 : 접근가능한 필드와 메소드가 제한됨
		System.out.println(j1.color);
	//	System.out.println(j2.color);
		//얘는 Dog로 생성되었기 때문에 불가능하다. 
		//j2 생성 시 Jindo 속성 중 Dog의 속성만 가져오게된다.
		System.out.println(((Jindo)j2).color);//이렇게 Jindo로 형변환 을 해줘야 사용가능하다
		System.out.println(((Dog)j3).name);//Jindo까지 확장 해주어도 상관X//이 때,Dog까지 확장 해 주었지만 이름은 Jindo의 디폴트값이다.
		//다운캐스팅 : 위 처럼 자식으로 형변환 한 것을 다운캐스팅이라고 함 - ((Jindo)j2).color 의 부분
		
		
		j3.what();//j3의 자료형: 애완동물(Pet) j3의 실제객체: 진돗개(Jindo)
		//컴파일 시 자료형을 확인한다.
		//실행될때는 실제 객체의 메소드가 출력된다.
		
		//즉 "나는 뭘까" & "나는 그중에서도 진돗개" 중에서 진돗개!가 출력된다!
		
		//이를 동적 바인딩(dynamic binding)이라고 한다.  ((12주차 PDF P.36참고
		//->메소드가 실행될 때 실제 객체랑 연결되는 것
		
		Jindo j4 = new Jindo();
		//System.out.println(j1==j2);System.out.println(j1==j2);//이렇게 하면 참조자료형이기 때문에 주소를 비교하므로 당연히 false라고 뜸 ㅇㅇ
		//equals를 사용하여 내요비교 가능
		System.out.println(j1.equals(j4));//이런식으로 비교가능 equals를 만들지 않아도 이미 object 클래스에 equals가 표함됨!!
		//하지만 object클래스의 equals는 그냥 == 처럼 주소값 비교밖에 안된다 그래서 밑에서 재선언 해줘야된다~
		
		
		Stone st = new Stone();
		System.out.println(j1.equals(st));//이렇게 비교하면 컴파일은 되는데  실행하면 에러 뜸
		//equals 메소드 자체가 Jindo로 형변환 하여 비교하는데 st는 Stone이므로 오류뜬당ㅇㅇ
		//그래서 Jindo의 equals메소드에 instanceof부분을 추가해줌-> false 뜰거임 ㅇㅇ
	}
}

class Cat extends Pet{}
class Stone{}

class Pet{
	int age;
	void what(){
		System.out.println("나는 뭘까...");
	}
	Pet(){this(1);}
	Pet(int age){
		this.age= age;
	}
	
	void info(){
		System.out.printf("이 애완동물의 나이는 %d이다.\n",age);
	}
}

class Dog extends Pet{
	String name;
	@Override //재정의 했다는 뜻
	void what(){
		System.out.println("나는 강아지!");
	}
	Dog(){//디폴트인데 0과null로 두기 뭐해서 초기화해줌ㅋ
		this(1,"뽀삐");
	}
	Dog(int age, String name){
		super(age);// == Pet(age) == super.age=age  == this.age=age
		//만약 저거(super(age))없이 name만 초기화해주면 우선적으로 부모 클래스의 디폴트 생성 후에 name 초기화해줌
		//만약 Pet에 디폴트가 없으면 자동적으로 디폴트 생성함
		//하지만 디폴드는 없는데 Pet(int age){...}와 같이 초기화해주는게 있다면 오류 뜸
		this.name=name;
	}
	
	void info(){
		System.out.printf("이 강아지의 나이는 %d이고, 이름은%s이다.\n",age,name);
	}
	
	
}

class Jindo extends Dog{
	String color;
	@Override
	void what(){
		System.out.println("나는 그 중에서도 진돗개");
	}
	Jindo(){
		this(1,"진돗진돗","하얀색");
	}
	Jindo(int age, String name,String color){
		super(age,name);//얘는 무족권 제일 위에 있어야된다~
		this.color=color;
	}
	
	void info(){
		System.out.printf("이 강아지의 나이는 %d이고, 이름은%s이고, 색깔은 %s이다.\n",age,name,color);
	}
	
	//나이와 이름,색싱이 같으면 같은 강아지로 간조하도록 equals(Dog d)메소드 작성하기
/*	boolean equals(Jindo j){//얘는 재정가 아니라 중복정의라고함//재정의이면 equals(object obj)라고 써야된다.
		if(j.age==this.age&& j.name.equals(this.name)&&j.color.equals(this.color))
			return true;
		else return false;
		
	}근데 이 방법은 재정의가 아니기 때문에 재정의로 다시해보자!*/
	public boolean equals(Object o){//위에서 o == j4임
		if(o instanceof Jindo){// instanceof를 써줬기 때문에 object에 진돗개가 안 들어오면 무족권 false로 함 ㅇㅇ
			return this.age == ((Pet)o).age && this.name.equals(((Dog)o).name) && this.color.equals(((Jindo)o).color);
			//이렇게도 가능한데이왕이면 확장을 모두 Jindo클래스로 해주는것이 낫다 -> this.age==((Jindo)o).age 처럼
		}
		else return false;
		
	}
	
	
}