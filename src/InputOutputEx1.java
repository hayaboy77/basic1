import java.io.*;

public class InputOutputEx1 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("0~9 사이의 정수를 입력하시오...");
		
		int n;
		n = System.in.read()-48; // n = System.in.read()-'0'; //read는 int형 ASCII값으로 반환
		
		System.out.println(n);
		
		System.out.println("입력하시오");
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		
		while(true) {
			int c = isr.read();
					if(c==-1) {
						break;
					}
					System.out.println((char)c);
		}
		
	}

}
