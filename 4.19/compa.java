import java.util.Scanner;

/*
		1.문자열 동등 비교: 문자열1.equals(문자열2)   //결과값:T or F
			ex)"abc".equals("ABC") 		=>결과:False
			
		2.문자열 대소문자 무시하고 동등 비교: 문자열1.equalsIgnoreCase(문자열2)
			ex)"abc".equals("ABC") 		=>결과:True
		
		3.문자열 비교 : 문자열1.compareTo(문자열2) //결과값:정수(문자열1-문자열2)
			ex) "abc".compareTo("adfcd")	=>결과 -2 (= b-d)
				a,a같음->b,d다름!->여기서 비교 끝!(그 뒤는 신경X)
			ex) "abc".compareTo("abfcd")	=>결과 -3 (= c-f)
				a,a같음->b,b같음->c,f다름
				
			ex2) String a= "ab", b="cd"
			a.compareTo(b); //결과: -2
			a.compareTo("ab")//0
			a.compareTo("abc")//-1 : 비교가능한것은 다 같고 앞쪽에 비교할 것 없음-> 음수
			"abcd".compareTo("abc")//1 : 비교가능한것은 다 같고 뒤쪽에 비교할 것 없음-> 양수
		
		4."abc".compareTo
		
		5.문자열에서 단어 교체: 문자열.replaceAll(구단어, 신단어) 
			ex)	s = "HELLO, WORLD! HELLO,JAVA!".replaceAll("HELLO","Hello");
				s = "Hello, WORLD! Hello,JAVA!" <- 대문자의 헬로가 소문자가 되었다
			
			//그냥 replace 함수는 문자(%c)만 바꿈 :replaceAll으로 한글자만 바꾸는거랑 차이X
		*/

class compa{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		//사전식으로 정렬하기
		//compareTo 함수 사용해서 음수 나오면 바꿀필요 X ex)
		//양수 나오면 바꿔야 된다 ex) "xyz".compareTo("abc") 결과 양수임->abc가 앞으로 가야함
		String tmp;
		//args 배열의 길이(원소갯수)
		//args 배열의 첫번? 성분(문자열)의 길이
		for(int i=0;i<(args.length-1);i++){
			for(int j=i+1;j<args.length;j++){
				if(args[i].compareToIgnoreCase(args[j])>0){
					tmp=args[i];
					args[i]=args[j];
					args[j]=tmp;
				}
			}
		}
		for(int k=0;k<args.length;k++){
			System.out.print(args[k]+" ");
		}
		//args 배열의 길이(원소갯수)
		//args 배열의 첫번? 성분(문자열)의 길이
		//의 코드짜기(문제임 ㅎ)
		
		System.out.printf(args.length); 
		System.out.printf(args[0].length()); 
		
		//착각하지말것
		
	}
}



