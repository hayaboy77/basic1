import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutpuEx1 {

	
	public static void main(String[] args) throws IOException {
		
		
//		System.out.println("0~9 사이의 정수값을 입력하시오...");
//		
//		
//		int n=System.in.read()-'0';// 반환값이 ASCII 값으로 반환을 한다.
//		
//		System.out.println(n);
		
		
		System.out.println("입력하시오...");
		
		
		InputStreamReader id = new InputStreamReader(System.in);
		
		
		while(true) {
		
			int c=id.read();
			if(c == -1) // ASCII값이 -1인경우는 Ctrl+z
				break;
			
			
			System.out.println((char)c);
			
		}
		
		
	}
	

}