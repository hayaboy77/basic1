
public class MemberDemo {
	//Ŭ������ ������� : �Ӽ�(�ʵ�) + �޼���(������)
	
	static int aa; //static ����
	String str; // �ν��Ͻ� ����
	
	//������ : static�� �����ʴ´�.
	
	// �⺻�����ڴ� �ڹ� �����Ϸ��� �ڵ����� �������ֱ⶧���� �����ص� ����.
	//public MemberDemo(){
		
	//}
	
//	public MemberDemo(){		
//		System.out.println("Constructor");
//	}
//	
	
	
	public static void yy(){
		System.out.println("Ŭ�����޼ҵ�");
	}
	
	public static String yyy(){
		System.out.println("��ȯ���� �ִ� Ŭ�����޼ҵ�");
		return "��ȯ��";
	}
	
	public void xx(){
		System.out.println("�ν��Ͻ� �޼ҵ�1");		
	}
	
	public int xxx(){
		System.out.println("��ȯ���� �ִ� �ν��Ͻ� �޼ҵ�");
		return 1000;
	}
	
	public void zz(String str1){
		System.out.println("�Ű������� �ִ� �޼ҵ� :"+str1);
	}
		
	
	public static void main(String[] args) {
		//�����ڸ� ȣ������. ���ǹ̴� ��ü�� �����Ѵٴ� �ǹ̰� �ȴ�.
		MemberDemo md = new MemberDemo();
		md.xx();
		yy();
		
		md.zz("�Ķ����");
		
		String str2 = yyy();
		
		System.out.println(str2);
		
		int aa1 = md.xxx();
		System.out.println(aa1);

	}

}
