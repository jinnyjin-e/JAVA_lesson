//다른 자동차 코드 하나 만들건데 클래스 이름을 다르게 하거나 다른 폴더에 해야된다아ㅏㅏㅏㅏ
class CAR{
	//필드: 색상,주행거리,이제까지 생성된 자동차의 댓수
	//생성자: 디폴트 생성자, 색상과 주행거리를 초기화하는 생성자
	//단, 디폴트 생성자는 주행거리가 1인 파란색 자동차를 생성
	String color;
	double dist;
	static int cnt=0;
	
	CAR(String color, double dist){
		this.color = color;
		this.dist = dist;
		cnt++; //필드는 개별적으로 가지게되므로 c1에 1 ,c2에 1, c3에1 이 각각 저장된다. 그런데 위에서 static을 붙여주면 cnt필드는공유된다.
	}//색상과 주행거리를 초기화하는 생성자
	
	CAR(){
		this("파란색",1);
	}//디폴트 생성자 <-파란색이면서 주행거리가 1인 자동차임
	
	void tellColor(){
		System.out.println("내 색상은 "+color);
	}
	
}
//매소드에서 static이 붙는다 => 매소드의 결과가 객체에 독립적일때 static을 붙인다.
//쉽게 생각하면 결과가 변하면 안되는것들은 static붙여줌. ex)cos(0)같은 값들
class CarTest{
	public static void main(String [] args){
		CAR c1 = new CAR();
		CAR c2 = new CAR("빨간색",100);
		CAR c3 = new CAR();
		System.out.println("이제까지 "+CAR.cnt+"대 만들었음");
		//c1.cnt의 형식이 아니라 CAR이 cnt를 공유하고 있으므로 CAR.cnt로 써줌
		//객체.멤버 가 아니라 클래스.멤버 의 형태로 해줌
		
		c1.tellColor();
		c2.tellColor();
		
	}
}