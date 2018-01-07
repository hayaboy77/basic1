
public class Argutest {
	
	//static int c;
	public static void main(String args[]) {
		
		int a;
		int b;
		int c;
		int Tot;
		
		if (args.length==3) {
		   a=Integer.parseInt(args[0]);    //프롬프트상태에서 들어오는 매개변수는 무조건 String 상태임
		   b=Integer.parseInt(args[1]);
		   c=Integer.parseInt(args[2]);
		}
		
		else{
			a=0;
			b=0;
			c=0;
		}
		 Tot=a+b+c;
		 System.out.println(Tot);
	}
                    // Run – Configuration에서 실행
}

