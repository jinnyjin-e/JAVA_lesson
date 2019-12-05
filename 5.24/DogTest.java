
class Dog{
	int age;
	String name;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//강아지의 모든 정보를 반환하도록 재정의
	public String toString(){//public 있어야 되는 이유: 부모클래스에서 public으로 공유해주어서(object 메소드에서 public으로 선언되어있음 그걸 자식메소드인 Dog에서 쓰는거고)
	// 부모의 범위보다 더 좀은 범위로 재정의 불가능
		//ㄴ 부모:public 자식:public 가능, 부모:protected 자식:public 가능, 부모:public 자식:protected 불가능
		return String.format("나이 : %d, 이름: %s",age,name);
	}
	//equals() 매소드 : 이름과 나이가 같다면 같은 강아지로 재정의하는것
/*	public boolean equals(Dog d){
		return ((this.age == d.age) && (this.name.equals(d.name)));
		//d.equals(d2) 이므로  this.age의 age는 d의 나이, d.age의 age는 d2의 나이임
		//참 거짓으로 반환된다.
		//요렇게하면 중복정의임 재정이가 아니라 아래쪽이 재정의임
	}
	*/
	public boolean equals(Object o){
		return ((this.age == ((Dog)o).age) && (this.name.equals(((Dog)o).name)));
		//미완성임 -컴파일 후에 실행시 에러뜸
	
	}
}
class DogTest{
	public static void main(String [] args){
		Dog d = new Dog("바둑이",10);
		Dog d2 = new Dog("누렁이",10);
		System.out.print(d.equals(d2));
		
//		Bike b = new Bike();
		Animal a = new Animal();

		System.out.println(d);
		
		//getClass 사용해보기
		System.out.println(a.getClass());//a가 속한 클래스 말해줌
		System.out.println(a.getClass().getName());//a가 속한 클래스의 이름만 말해줌
		
	}
}