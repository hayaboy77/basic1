//������

public class OperatorEx
{
	
	public static void main(String [] args)
	{
		System.out.println("1.��� ������");
		int a = 100;
		
		System.out.println(a%7);
		
		//����Ʈ ������ >>, <<, >>>(�ڹٿ��� �ִ� ������)
		// 1) >> ---> ���������� �־��� ��Ʈ����ŭ �̵��϶�.
		//            �տ� ����ִ� ��ĭ�� ��ȣ��Ʈ�� ä���
		
//		   2) << ----> �������� �־��� ��Ʈ����ŭ �̵��϶�.
//		               �ڿ� ����ִ� ��ĭ�� 0���� ä���. 
//		   3) >>>(�ڹٿ��� �ִ� ������) ---> ���������� �־��� ��Ʈ����ŭ �̵��϶�.
//		            �տ� ����ִ� ��ĭ�� 0���� ä���.
		
		System.out.println("-6 >> 2="+(-6 >> 2));
		System.out.println("-6 >>> 2="+(-6 >>> 2)); 
		System.out.println("-6 << 2="+(-6 << 2));
		
		System.out.println("2. ��������(��Ʈ ������)");
		int b = 3;
		int c = 5;
		
		System.out.println("b And c ="+(b&c));
		System.out.println("b OR c ="+(b|c));
		System.out.println("b XOR c ="+(b^c));
		
		// &&, ||(���� ������)
		
		int mm = 20;
		int nn = 5;
		
//		if((mm>nn)&&(mm>10))
//			System.out.println("���Դϴ�.");
//		else
//			System.out.println("�����Դϴ�.");
		
		if((mm>nn)||(mm==10))
			System.out.println("���Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		
		
		System.out.println("3. �񱳿�����");
		int m = 100, n = 100;
		
		// �񱳿��� L>R (L�� R����ū), >=(ũ�ų� ����), <=(�۰ų� ����), <(R��������), ==(L��  R�� ����)
		// != : L�� R�� ���� ���� ����
//		if(m>n)
//			System.out.println("m�� n���� Ů�ϴ�.!");
//		else
//			System.out.println("m�� n���� �۰ų� �����ϴ�.!");
			
//		if(m>=n)
//			System.out.println("m�� n���� ũ�ų� ����.!");
//		else
//			System.out.println("m�� n���� �۴�.!");
		
		if(m!=n)
			System.out.println("m�� n�� ���� �ʴ�.");
		else
			System.out.println("m�� n�� ����!");
		
		System.out.println("4. ���׿�����");
		int aa=100, bb =200;
		
		//���� = (����)? ��1: ��2;
		
		int result =(aa>bb)? aa: bb;
		
		System.out.println("result="+result);
		
		String str = (aa>bb)? "aa�� bb���� ŭ":"aa�� bb���� �۰ų� ����"; 
		
		System.out.println("str ="+str);
		
		System.out.println("5. ���Կ�����");
		
		int ii = 10;
		ii+=10; //ii=ii+10���� ���� �ӵ��� ������;
		
		int jj=10;
		// jj -=3; //jj=jj-3;
		jj *=2; //jj=jj*2;
		
		int x = 5;
		x <<=2; // x=x<<2;
		
		int y = 3;
		y ^=2; //y=y^2; XOR ���� ���δٸ� ��Ʈ�� ��� ���� 1 
		
		
		System.out.println("ii ="+ii);
		System.out.println("jj ="+jj);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println("6. ���� ������");
		// ++, -- (����������) , +, -(��ȣ������)
		
		int xx = 10, yy=20;
		System.out.println(+xx);
		System.out.println(-xx);
		
		int k = 10;
		byte kk = 20;
		
		k++; //k=k+1;
		kk--;//kk = kk-1;
		
		System.out.println("k="+k);
		System.out.println("kk="+kk);
		
		int cc = 10;
		int dd =++cc;// cc���� ���� ������Ű�� ������ dd�� ������ �Ѵ�.
		
		cc = 10;
		int ee =cc++;// ������ �������� cc���� ���� ��Ų��.
		System.out.println("cc="+cc);
		System.out.println("ee="+ee);
		
		// ��Ʈ�� not ������ : ~
		
		int gg = 0xfffffff3;
		System.out.println("~gg ="+~gg);
		
		// ������ ������ : !
		boolean bool = true;
		
		System.out.println(!bool);
		System.out.println(!(100>200));
	}
}
