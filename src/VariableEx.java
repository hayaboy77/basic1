// ����

public class VariableEx
{
	public static void main(String [] args)
	{
		System.out.println("1. ������");
		byte bt=10; // -128~127, ������ �ʱ�ȭ
		byte bt2 = 127;
		System.out.println("bt ="+bt);
		System.out.println("bt2 ="+bt2);
		
		short st = 1000;
		System.out.println("st ="+st);//-32,768~32767
		
		int i=1000000;
		System.out.println("i ="+i); // -2147483628~2147483627 ����
		
		long ln = 1000000000l; //�ҹ���l, �빮�� L�� ���̻�� ����Ѵ�.(long��)
		long ln1 = 1200L;
		long ln2 = 3000000000L; //�ڹٿ����� �������� �⺻���� int(��, �ڹٿ�����
		                       // �������� ������ int������ �ν��Ѵ�.) 
		
		System.out.println("ln ="+ln);
		System.out.println("### ���α׷��� �� ###");		
	}
}
