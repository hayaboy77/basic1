
public class ArrayEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�迭����
		int[] a;
		//�迭����(�޸𸮿� �Ҵ�)
		a = new int[3];
		
		//�ʱ�ȭ
		//a[0]= 100;
		a[1]=200;
		a[2]=300;
		//a[3]=400;
		
		System.out.println("�迭 a[0] ="+a[0]);
		System.out.println("�迭 a[1] ="+a[1]);
		System.out.println("�迭 a[2] ="+a[2]);
		//length �迭�� ���̸� �˰��� �Ҷ�
		System.out.println("�迭 a�� ũ��� :"+a.length);
		
		int  i[]={100, 200, 300, 400};
		
		System.out.println("�迭 i[0] ="+i[0]);
		System.out.println("�迭 i[1] ="+i[1]);
		System.out.println("�迭 i[2] ="+i[2]);
		System.out.println("�迭 i[3] ="+i[3]);
		System.out.println("�迭 i�� ũ��� :"+i.length);
		
	}

}
