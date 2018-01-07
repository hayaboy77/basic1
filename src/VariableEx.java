// 변수

public class VariableEx
{
	public static void main(String [] args)
	{
		System.out.println("1. 정수형");
		byte bt=10; // -128~127, 변수의 초기화
		byte bt2 = 127;
		System.out.println("bt ="+bt);
		System.out.println("bt2 ="+bt2);
		
		short st = 1000;
		System.out.println("st ="+st);//-32,768~32767
		
		int i=1000000;
		System.out.println("i ="+i); // -2147483628~2147483627 까지
		
		long ln = 1000000000l; //소문자l, 대문자 L을 접미사로 사용한다.(long형)
		long ln1 = 1200L;
		long ln2 = 3000000000L; //자바에서는 정수형의 기본형이 int(즉, 자바에서는
		                       // 정수값은 무조건 int형으로 인식한다.) 
		
		System.out.println("ln ="+ln);
		System.out.println("### 프로그램의 끝 ###");		
	}
}
