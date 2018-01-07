public class DataTypeEx
{
	public static void main(String args [])
	{
		System.out.println("2.실수형");
		//실수형: float형, double형
		//float: 소수점 이하 7자리까지 표현가능
		//double: 소수점이하 15~16...표현가능 자바에서는
		// 실수는 무조건 double 형으로 인식한다.
		
		float ft = 2.456F; //대문자 F, 소문자 f를 접미사로 사용한다.
		
		System.out.println("ft ="+ft);
		
		float ft2 = 333;
		System.out.println("ft2 ="+ft2);
		
		// byte < short < int < long < float < double
		//		  char 
		
		double db = 12.1111;
		System.out.println("db ="+db);
		
		double db2 = 0.2333E3; // 0.233*10^3
		System.out.println("db2="+db2);
		
		double db3 = 233333333333.0000012;
		// 0.2333333333330000012E12
		System.out.println("db3="+db3);
		
		System.out.println("3.문자형");
		char ch = '가';
		//char:0~65535, 2byte
		//c언어에서는 1byte( ASCII코드) 자바에서는 유니코드체계(2byte)를 사용
		char ch2='a';
		System.out.println("ch="+ch);
		System.out.println("ch2="+ch2);
		char ch3='\u0041'; // 16진수 0~9,A B C D E F -> 4*16^1+1*16^0=65
		System.out.println("ch3="+ch3);
		System.out.println(ch3+3); //68
		
		System.out.println("4.논리형");
		
		boolean bool = true; //True(x) False(x) 소문자를 사용해야한다.
		System.out.println("bool ="+bool); //0, 1 참거짓 표현할 수 없다.
		
		//문자는 '를 사용'ㅁ', 문자열은 "를 사용하여 표시한다.
		// + 연산자 원리: 문자열 + 데이타타입 ---> 문자열, 데이타타입 + 문자열 ---> 문자열
		
		System.out.println("*** 참조형****");
		String str = "반갑습니다... 여러분!!!"; //기본형이 아니라 참조형이다..
		
		String str1 = new String("반갑습니다... 여러분!!!");		
		System.out.println(str);
		System.out.println(str1);
	}
}