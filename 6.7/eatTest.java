/*클래스
	-나 : eat()메소드 ->햄버거를 주면은 햄버거를 먹습니다.
	-햄버거
	-아이스크림
	-빙수
	-김밥
*/
//상속의 장점: 메소드 작성시 매게변수를 부모타임으로 하면 자식클래스 객체는 모두 받을 수 있다아ㅏㅏㅏ
class eatTest{
	public static void main(String [] args){
		I i = new I();
		Hamberger h = new Hamberger();
		Icecream ice =new Icecream();
		빙수 빙 = new 빙수();
		
		
		i.eat(h);//출력시 햄버거를 먹는다 출력
		i.eat(ice);
		i.eat(빙);
		i.eat(new 김밥());//이렇게 해도 된다~
		i.eat(new Stone());
		
	}
}
class I{
	void eat(Object o){//이렇게 해도 된느데 Food 클래스 하나 만들어서 eat(Food f) 하는게 나을 것 같다고 하심
	// 돌 안 먹게 하기 위해서 Object로 받고 instanceof를 사용해준다.
		if(o instanceof Food) System.out.printf("나는 %s를 먹습니다.\n",o.getClass().getName());
		else System.out.printf("돌을 어떻게 먹냐...");
	}
	
	void eat(Food f){//돌 안먹게 하는거를 빼낼 수 없음...ㅜ
		System.out.printf("나는 %s를(을) 먹습니다.\n",f.getClass().getName());
		//Food에서 getClass를 했는데 Food가 아닌 Hamberger등이 출력된 것은 동적바인딩이 일어났기 때문이다. ㅇㅇㅇㅇ
		
	}
}
class Stone{}
class Food{}
	
class Hamberger extends Food {}//I에 종속 될 필요 없음
class Icecream extends Food {}
class 빙수 extends Food {}
class 김밥 extends Food {}
