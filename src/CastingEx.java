
public class CastingEx {
	public static void main(String [] args)
	{
		byte bt = 10;
		long ln = bt; // �ڵ�����ȯ
		
		int i = (int)ln; //��������ȯ (casting)
		
		System.out.println("ln="+ln);
		System.out.println("i ="+i);
	
		char ch = 'A';
		System.out.println(ch+1); //������ ���������� �ڵ�����ȯ
		
		char ch2 = 'C';
		int result = ch2 + 3;
		System.out.println("result ="+result);
		
		char ch3 = (char)result;
		System.out.println("ch3 ="+ch3);
		
	}
}
