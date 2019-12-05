//static 메소드: 결과까지 객체에 무관한 메소드임
// = 누구에게 묻든 결과가 똑같은 메소드이다~
ex)
static void speak(){
	Systeme.out.print("이것은 자전거이다");
}
//이렇다면 어떤 것에서든 "이것은 자전거다"라고 해줌

static void speak(){
	Systeme.out.print("이 자전거는 %s색이다.",color);
}
//이런 경우는 불가능-하다 계속 값들이 다르기때문에 static을 써주면 안된다.(color는 non-static이다)
//컴파일 오류 뜰거임


*static 멤버는 객체가 없는 상황에서 호출 가능~
	ㄴ 자전거 몇대 생성했는지 Bike.cnt 같이 호출 가능 ㅇㅇ
*non-static 멤버(인스턴스 멤버)는 객체가 없을 때 호출 불가능!
	ㄴ 자전거가 생성되지 않았는데 색깔 호출 불가능하다
*static 메소드에서 non-static 멤버로 접근 불가능하다!!! 중요
	ㄴ static 메소드는 객체없이 가능하다 했는데 non-static은 객체 무적권 필요하다함

ArrTest파일 참고
	rotateRn 앞에 static 안 붙여준다면
대부분의 main함수는 static으로 하는데
같은 main함수 안에 non-static 메소드를 만들어버리면 호출 불가해진다.- 객체를 생성하지 않았을 때문에
만약 ArrTest at1 = new ArrTest(); 와 같이 객체를 만들어준다면(메인함수를 객체로 만들어줌) static을 안 붙이고 가능하다



