//연산자

public class OperatorEx
{
	
	public static void main(String [] args)
	{
		System.out.println("1.산술 연산자");
		int a = 100;
		
		System.out.println(a%7);
		
		//쉬프트 연산자 >>, <<, >>>(자바에만 있는 연산자)
		// 1) >> ---> 오른쪽으로 주어진 비트수만큼 이동하라.
		//            앞에 비어있는 빈칸은 부호비트로 채운다
		
//		   2) << ----> 왼쪽으로 주어진 비트수만큼 이동하라.
//		               뒤에 비어있는 빈칸은 0으로 채운다. 
//		   3) >>>(자바에만 있는 연산자) ---> 오른쪽으로 주어진 비트수만큼 이동하라.
//		            앞에 비어있는 빈칸은 0으로 채운다.
		
		System.out.println("-6 >> 2="+(-6 >> 2));
		System.out.println("-6 >>> 2="+(-6 >>> 2)); 
		System.out.println("-6 << 2="+(-6 << 2));
		
		System.out.println("2. 논리연산자(비트 연산자)");
		int b = 3;
		int c = 5;
		
		System.out.println("b And c ="+(b&c));
		System.out.println("b OR c ="+(b|c));
		System.out.println("b XOR c ="+(b^c));
		
		// &&, ||(조건 연산자)
		
		int mm = 20;
		int nn = 5;
		
//		if((mm>nn)&&(mm>10))
//			System.out.println("참입니다.");
//		else
//			System.out.println("거짓입니다.");
		
		if((mm>nn)||(mm==10))
			System.out.println("참입니다.");
		else
			System.out.println("거짓입니다.");
		
		
		System.out.println("3. 비교연산자");
		int m = 100, n = 100;
		
		// 비교연산 L>R (L이 R보다큰), >=(크거나 같은), <=(작거나 같은), <(R보다작은), ==(L과  R이 같은)
		// != : L과 R이 서로 같지 않은
//		if(m>n)
//			System.out.println("m은 n보다 큽니다.!");
//		else
//			System.out.println("m은 n보다 작거나 같습니다.!");
			
//		if(m>=n)
//			System.out.println("m은 n보다 크거나 같다.!");
//		else
//			System.out.println("m은 n보다 작다.!");
		
		if(m!=n)
			System.out.println("m과 n은 같지 않다.");
		else
			System.out.println("m과 n은 같다!");
		
		System.out.println("4. 삼항연산자");
		int aa=100, bb =200;
		
		//변수 = (조건)? 값1: 값2;
		
		int result =(aa>bb)? aa: bb;
		
		System.out.println("result="+result);
		
		String str = (aa>bb)? "aa는 bb보다 큼":"aa는 bb보다 작거나 같다"; 
		
		System.out.println("str ="+str);
		
		System.out.println("5. 대입연산자");
		
		int ii = 10;
		ii+=10; //ii=ii+10보다 연산 속도가 빠르다;
		
		int jj=10;
		// jj -=3; //jj=jj-3;
		jj *=2; //jj=jj*2;
		
		int x = 5;
		x <<=2; // x=x<<2;
		
		int y = 3;
		y ^=2; //y=y^2; XOR 연산 서로다른 비트인 경우 값이 1 
		
		
		System.out.println("ii ="+ii);
		System.out.println("jj ="+jj);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println("6. 단항 연산자");
		// ++, -- (증감연산자) , +, -(부호연산자)
		
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
		int dd =++cc;// cc값을 먼저 증가시키고 다음에 dd에 대입을 한다.
		
		cc = 10;
		int ee =cc++;// 대입을 먼저한후 cc값을 증가 시킨다.
		System.out.println("cc="+cc);
		System.out.println("ee="+ee);
		
		// 비트별 not 연산자 : ~
		
		int gg = 0xfffffff3;
		System.out.println("~gg ="+~gg);
		
		// 논리부정 연산자 : !
		boolean bool = true;
		
		System.out.println(!bool);
		System.out.println(!(100>200));
	}
}
