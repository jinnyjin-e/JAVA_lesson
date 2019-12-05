import java.util.Scanner;

class DaysInMonth{
	public static void main(String [] args){
		int year, month, days;	
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 년 : ");
		year = s.nextInt();		//사용자로부터 몇년인지 입력 받음
		System.out.print("몇 월 : ");
		month = s.nextInt();	//사용자로부터 몇월인지 입력 받음
		
		switch(month){
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			days=31;
			break; 	//이 달들은 31일이 있는데, 이미 days를 31으로 정의해두었기 때문에 days는 손 델 필요 없고 break걸어서 switch문 빠져 나가면 됨
		case 4:	case 6:	case 9:	case 11:
			days = 30;	//이 달들은 30일이 있으므로 변수 days를 30으로 바꿔주고 
			break;		//break걸어서 switch문 빠져 나가면 됨
		case 2: //2월인 경우 복잡
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) days = 29; //윤년인 경우 
			else days = 28;			//윤년이 아닌 경우
			break;
		default: 
			System.out.println("그런 달은 없습니다."); 		//이외의 달을 입력한 경우
			return;
		}
		
		System.out.print(year + "년 " + month + "월은 "+ days+ "일까지 있습니다.\n");
		
	}
}