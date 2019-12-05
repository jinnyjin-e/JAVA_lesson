/*클래스 
	-지휘자
		direct(연주자들) => 각 연주자들에게 연주시킴
	아래 클래스들을 play()메소드를 가짐
	-피아니스트
		play() : 피아노를 연주합니다
	-첼리스트
		play() : 첼로를 연주합니다
	-바이올리니스트
		play() : 바이올린을 연주합니다
	
	-테스트 클래스
		지휘자 한명과 연주자 몇명 생성,
		지휘자가 연주자들에게 지휘하는것을 테스트
*/
/*final - 변수 	: 상수화
		- 메소드	: 재정의 불가
		- 클래스 	: 상속 불가
*/
class musical{
	public static void main(String [] args){
		Maestro m = new Maestro();
		player [] players = {new 피아니스트(), new 첼리스트(), new 첼리스트(), new 첼리스트(), new 바이올리니스트(), new 바이올리니스트(), new 바이올리니스트(), new 바이올리니스트()};
		//상속의 장점: 서로 다른 자식 클래스의 객체들을 부모클래스의 객체들의 배열로 그룹핑 할 수 있음 ㅇㅇ
	
		/*원래는
		피아니스트 p1 = new ...
		첼리스트 c1 = new ..
		이런 형식이었는데 전부 자료형을 player로 할 수 있음 
		-> 그런데 모두 같은 자료형이므로 배열로도 가능!!!->상속의 장점2임
		player p1 = new 피아니스트();
		player c1 = new 첼리스트();
		player c2 = new 첼리스트();
		player c3 = new 첼리스트();
		player v1 = new 바이올리니스트();
		player v2 = new 바이올리니스트();
		player v3 = new 바이올리니스트();
		player v4 = new 바이올리니스트();*/
		
		m.direct(players);
		
	}
}
class Maestro{
	void direct(player [] players){//괄호안에 배열도 가능
		for(player p :players){
			p.play();
		}
	}
	
}
class player{
	void play(){
	}
}

class 피아니스트 extends player{
	@Override
	void play(){
		System.out.println("피아노를 연주합니다.");
	}
}

class 첼리스트 extends player{
	@Override
	void play(){
		System.out.println("첼로를 연주합니다.");
	}
}

class 바이올리니스트 extends player{
	@Override
	void play(){
		System.out.println("바이올린을 연주합니다.");
	}
}