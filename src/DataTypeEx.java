public class DataTypeEx
{
	public static void main(String args [])
	{
		System.out.println("2.�Ǽ���");
		//�Ǽ���: float��, double��
		//float: �Ҽ��� ���� 7�ڸ����� ǥ������
		//double: �Ҽ������� 15~16...ǥ������ �ڹٿ�����
		// �Ǽ��� ������ double ������ �ν��Ѵ�.
		
		float ft = 2.456F; //�빮�� F, �ҹ��� f�� ���̻�� ����Ѵ�.
		
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
		
		System.out.println("3.������");
		char ch = '��';
		//char:0~65535, 2byte
		//c������ 1byte( ASCII�ڵ�) �ڹٿ����� �����ڵ�ü��(2byte)�� ���
		char ch2='a';
		System.out.println("ch="+ch);
		System.out.println("ch2="+ch2);
		char ch3='\u0041'; // 16���� 0~9,A B C D E F -> 4*16^1+1*16^0=65
		System.out.println("ch3="+ch3);
		System.out.println(ch3+3); //68
		
		System.out.println("4.����");
		
		boolean bool = true; //True(x) False(x) �ҹ��ڸ� ����ؾ��Ѵ�.
		System.out.println("bool ="+bool); //0, 1 ������ ǥ���� �� ����.
		
		//���ڴ� '�� ���'��', ���ڿ��� "�� ����Ͽ� ǥ���Ѵ�.
		// + ������ ����: ���ڿ� + ����ŸŸ�� ---> ���ڿ�, ����ŸŸ�� + ���ڿ� ---> ���ڿ�
		
		System.out.println("*** ������****");
		String str = "�ݰ����ϴ�... ������!!!"; //�⺻���� �ƴ϶� �������̴�..
		
		String str1 = new String("�ݰ����ϴ�... ������!!!");		
		System.out.println(str);
		System.out.println(str1);
	}
}