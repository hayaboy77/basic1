
public class ArrayEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언
		int[] a;
		//배열생성(메모리에 할당)
		a = new int[3];
		
		//초기화
		//a[0]= 100;
		a[1]=200;
		a[2]=300;
		//a[3]=400;
		
		System.out.println("배열 a[0] ="+a[0]);
		System.out.println("배열 a[1] ="+a[1]);
		System.out.println("배열 a[2] ="+a[2]);
		//length 배열의 길이를 알고자 할때
		System.out.println("배열 a의 크기는 :"+a.length);
		
		int  i[]={100, 200, 300, 400};
		
		System.out.println("배열 i[0] ="+i[0]);
		System.out.println("배열 i[1] ="+i[1]);
		System.out.println("배열 i[2] ="+i[2]);
		System.out.println("배열 i[3] ="+i[3]);
		System.out.println("배열 i의 크기는 :"+i.length);
		
	}

}
