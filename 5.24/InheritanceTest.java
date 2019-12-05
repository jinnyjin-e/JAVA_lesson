//상속

//동물 클래스 - 나이(필드) 먹다(메소드)
//사람 클래스 - 나이 이름 먹다 말하다
//학생 클래스 - 나이 이름 학년 성적 먹다 말하다 공부하다

/*동물이 가지고있는 나이/먹다 를 사람이 상속 받으면 중복해서 쓸 필요 X
	 -> extends 동물 이라고 표현
		사람: 자식클래스, subclass 라고 함 - 상속받는 클래스
		동물: 부모클래서, superclass -상속하는 클래스
	*/
//사람이 가지고있는 나이 이름 먹다 말하다를 학생이 상속받을 수 있음

class InheritanceTest{
	public static void main(String [] args){
		//사람 만들어서 먹기 요청
		//학생 만들어서 이름문도 먹으라고 요청
		Human h1 = new Human(21,"길동이");
		//자식클래스 생성자 생성 할 때 부모 클래스의 생성자도 생성된다.
		h1.eat();
		
		System.out.println();
		
		Student s1 = new Student();
		//s1.name = "홍길동";
		System.out.println("학생의 이름은 "+s1.name);
		s1.speak();
		
	}
}

class Animal{
	int age;
	void eat(){
		System.out.println("먹습니다.");
	}
	Animal(){
		System.out.println("동물 생성");
	}
	Animal(int age){
		this.age =age;
		System.out.println("동물 생성");
	}
	
}

class Human extends Animal{
	// 나이(상속받음) 이름 존재	
	String name;
	//먹다(상속받음) 말하다 존재
	void speak(){
		System.out.println("사람이 말합니다.");
	}
	Human(){
		System.out.println("사람 생성");
	}
	//나이와 이름을 초기화하는 사람생성자 만들기
	Human(int age, String name){
	//	super.age = age; 
		//부모클래스(super class)의 것을 가져온다고 해서 super.씀 this.age 라고 써도된다.
		//그런데 동물클래스의 생성자에서 초기화해주는것이 더 좋다. 그래서 아래처럼 표현
		super(age);//생성자 호출은 제일 위쪽에만 가능함, 부모클래스에서 호출해온다는 뜻
		this.name = name;
		System.out.println("사람 생성");
	}
}

class Student extends Human{//휴먼을 상속받음
	//나이 이름 학년 성적
	int grade;
	double score;
	
	//먹다 말하다 공부하다
	void study(){
		System.out.println("공부합니다.");
	}
	//말하다에서 "학생이 말합니다" 라고 고치고싶음
	@Override//<-얘는 없어도 되고 있어도 되고(재선언 한다는 것을 말함)/근데 있으면 실수로 잘못 적은거 찾아내줌
	void speak(){
		System.out.println("학생이 말합니다.");
		//앞에서 만들어진 speak의 내용을 새로 씀(초기화 된 것을 재선언 하는 것 같은 느낌)
		//이것을 메소드 재정의 라고 한다.(Override)
		//클래스만 재정의가 있고, 필드는 재정의 할 수 없다.
	}
	
	Student(){//사람생성자(부모클래스의 생성자가) 자동으로 호출됨
		System.out.println("항색 생성");
	}
}